package com.app.employe.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.app.employe.Entity.Employe;

@RepositoryRestResource
public interface EmployeRepository extends JpaRepository<Employe, Integer> {

}
