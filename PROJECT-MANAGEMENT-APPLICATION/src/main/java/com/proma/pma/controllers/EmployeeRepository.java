package com.proma.pma.controllers;

import org.springframework.data.repository.CrudRepository;

import com.proma.pma.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
