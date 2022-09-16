package com.misiontic.practica.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.misiontic.practica.entities.Empresa;

@Repository
public interface EnterprisesRepository 
    extends JpaRepository<Empresa, Long> {
}
