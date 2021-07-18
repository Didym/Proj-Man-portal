package com.proma.pma.dao;

import org.springframework.data.repository.CrudRepository;

import com.proma.pma.entities.Project;

public interface ProjectRepository extends CrudRepository<Project, Long> {

}
