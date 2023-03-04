package com.miskevich.domain;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Data
@Table(name = "employee")
@EqualsAndHashCode(exclude = {"city", "position"})
@ToString(exclude = {"city","position"})
public class Employee {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "employment_start")
    private Time employmentStart;

    @Column(name = "employment_end")
    private Time employmentEnd;

    @Column(name = "is_active" )
    private Boolean isActive;

    @Column(name = "creation_date" )
    private Timestamp creationDate;

    @Column(name = "modification_date")
    private Timestamp modificationDate;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;

    @OneToMany(mappedBy = "employee", fetch = FetchType.EAGER)
    @JsonManagedReference
    Set<Schedule> schedule ;

}
