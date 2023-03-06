package com.miskevich.service.employee;

import com.miskevich.domain.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {


    Employee creat(Employee employee);

    Employee update(Employee employee);

    Optional<Employee> findById(int id);

    List<Employee> findAll();

    void delete(int id);


}
