package com.miskevich.domain;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Data
@Entity
@Table(name = "position")
@EqualsAndHashCode(exclude = {"employee"})
@ToString(exclude = {"employee" })
public class Position {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "position_name")
    private String positionName;

    @OneToMany(mappedBy = "position", fetch = FetchType.EAGER)
    @JsonManagedReference
    Set<Employee> employees;

    @OneToMany(mappedBy = "position", fetch = FetchType.EAGER)
    @JsonManagedReference
    Set<Schedule> schedule;
}
