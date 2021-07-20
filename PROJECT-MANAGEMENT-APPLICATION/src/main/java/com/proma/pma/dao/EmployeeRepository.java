package com.proma.pma.dao;

import org.springframework.data.repository.CrudRepository;

import com.proma.pma.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
