create sequence offer_tack_id_seq
    as integer;

alter sequence offer_tack_id_seq owner to postgres;

create table if not exists position
(
    id            serial
        primary key,
    position_name varchar(50) default 'locksmith'::character varying not null
);

alter table position
    owner to postgres;

create table if not exists city
(
    id          serial
        primary key,
    postal_code varchar(20)  default '1234566789'::character varying not null,
    city_name   varchar(150) default 'name_city'::character varying  not null
);

alter table city
    owner to postgres;

create table if not exists repair_shops
(
    id        serial
        primary key
        unique
        constraint repair_shops_city_id_fk
            references city,
    shop_name varchar(255) default 'default_name'::character varying not null,
    address   varchar(255) default 'no_address'::character varying   not null,
    details   varchar(255),
    city_id   integer
);

alter table repair_shops
    owner to postgres;

create table if not exists "employee "
(
    id                serial
        primary key
        constraint "employee _city_id_fk"
            references city
        constraint "employee _position_id_fk"
            references position,
    first_name        varchar(100)                              not null,
    last_name         varchar(100)                              not null,
    employment_start  time,
    employment_end    time,
    is_active         boolean      default false                not null,
    creation_date     timestamp(6) default CURRENT_TIMESTAMP(6) not null,
    modification_date timestamp(6) default CURRENT_TIMESTAMP(6) not null,
    position_id       integer,
    city_id           integer
);

alter table "employee "
    owner to postgres;

create table if not exists schedule
(
    id              serial
        primary key
        constraint schedule_position_id_fk
            references position
        constraint schedule_repair_shops_id_fk
            references repair_shops
        constraint "schedule_employee _id_fk"
            references "employee ",
    time_start      time,
    time_end        time,
    actual          boolean default false not null,
    position_id     integer,
    repair_shops_id integer,
    employee_id     integer
);

alter table schedule
    owner to postgres;

create table if not exists "user"
(
    id                serial
        primary key,
    user_name         varchar(50)                                          not null,
    user_surname      varchar(100)                                         not null,
    user_address      varchar(255)                                         not null,
    mobile            varchar(20)                                          not null,
    email             varchar(255) default 'not_select'::character varying not null,
    details_user      varchar(255)                                         not null,
    creation_date     timestamp(6) default CURRENT_TIMESTAMP(6)            not null,
    modification_date timestamp(6) default CURRENT_TIMESTAMP(6)            not null,
    login_user        varchar(255)                                         not null,
    password_user     varchar(255)                                         not null
);

alter table "user"
    owner to postgres;

create table if not exists contact
(
    id                serial
        primary key
        constraint contact_schedule_id_fk
            references schedule
        constraint contact_user_id_fk
            references "user",
    contact_details   varchar(255)                              not null,
    creation_date     timestamp(6) default CURRENT_TIMESTAMP(6) not null,
    modification_date timestamp(6) default CURRENT_TIMESTAMP(6) not null,
    schedule_id       integer,
    user_id           integer                                   not null
);

alter table contact
    owner to postgres;

create table if not exists make
(
    id        serial
        primary key,
    make_name varchar(255) default 'www'::character varying not null
);

alter table make
    owner to postgres;

create table if not exists vehicle_type
(
    id                serial
        primary key,
    vehicle_type_name varchar(255)
);

alter table vehicle_type
    owner to postgres;

create table if not exists model
(
    id              serial
        primary key
        constraint model_make_id_fk
            references make
        constraint model_vehicle_type_id_fk
            references vehicle_type,
    model_name      varchar(200) default 'bmw'::character varying not null,
    make_id         integer,
    vehicle_type_id integer
);

alter table model
    owner to postgres;

create table if not exists vehicle
(
    id                serial
        primary key
        constraint vehicle_user_id_fk
            references "user"
        constraint vehicle_model_id_fk
            references model,
    vin               varchar(255) default '3454'::character varying       not null,
    manufactured      varchar(50)  default '01.01.2001'::character varying not null,
    creation_date     timestamp(6) default CURRENT_TIMESTAMP(6)            not null,
    modification_date timestamp(6) default CURRENT_TIMESTAMP(6)            not null,
    model_id          integer,
    user_id           integer
);

alter table vehicle
    owner to postgres;

create table if not exists service_catalog
(
    id               serial
        primary key,
    service_name     varchar(255),
    description      varchar(255)     default 'aaaaaaaaaaa'::text not null,
    service_discount double precision default 4.4                 not null,
    is_active        boolean          default false               not null
);

alter table service_catalog
    owner to postgres;

create table if not exists offer
(
    id                 serial
        primary key
        constraint offer_contact_id_fk
            references contact
        constraint offer_user_id_fk
            references "user"
        constraint offer_service_catalog_id_fk
            references service_catalog,
    offer_description  varchar(255)     default 'Problema'::text not null,
    service_discount   double precision default 3.2              not null,
    offer_price        double precision,
    user_id            integer,
    contact_id         integer                                   not null,
    service_catalog_id integer                                   not null
);

alter table offer
    owner to postgres;

create table if not exists task_catalog
(
    id                 serial
        primary key
        constraint task_catalog_service_catalog_id_fk
            references service_catalog,
    task_name          varchar(255)                         not null,
    descriptions       varchar(255)     default 'sds'::text not null,
    engine             varchar(10)                          not null,
    task_price         double precision default 3.5         not null,
    is_active          boolean          default false       not null,
    service_catalog_id integer
);

alter table task_catalog
    owner to postgres;

create table if not exists offer_task
(
    id              integer      default nextval('autoservice.offer_tack_id_seq'::regclass) not null
        constraint offer_tack_pkey
            primary key
        constraint offer_tack_offer_id_fk
            references offer
        constraint offer_tack_task_catalog_id_fk
            references task_catalog,
    task_price      double precision,
    creation_date   timestamp(6) default CURRENT_TIMESTAMP(6)                               not null,
    offer_id        integer,
    task_catalog_id integer
);

alter table offer_task
    owner to postgres;

alter sequence offer_tack_id_seq owned by offer_task.id;

create table if not exists flyway_schema_history
(
    installed_rank integer                 not null
        constraint flyway_schema_history_pk
            primary key,
    version        varchar(50),
    description    varchar(200)            not null,
    type           varchar(20)             not null,
    script         varchar(1000)           not null,
    checksum       integer,
    installed_by   varchar(100)            not null,
    installed_on   timestamp default now() not null,
    execution_time integer                 not null,
    success        boolean                 not null
);

alter table flyway_schema_history
    owner to postgres;

create index if not exists flyway_schema_history_s_idx
    on flyway_schema_history (success);

