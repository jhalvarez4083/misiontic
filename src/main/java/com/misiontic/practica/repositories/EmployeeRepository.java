package com.misiontic.practica.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.misiontic.practica.entities.Empleado;


@Repository
public interface EmployeeRepository 
    extends JpaRepository<Empleado, Long> {
}
