package com.misiontic.practica.Interfaces;

import java.util.List;

import com.misiontic.practica.entities.Empresa;



public interface EnterpriseInterface {
    // Save operation
    Empresa saveEmpresa(Empresa empresa);
 
    // Read operation
    List<Empresa> fetchEmpresaList();
 
    // Update operation
    Empresa updateeEmpresa(Empresa empresa,
                                Long empresaId);
 
    // Delete operation
    void deleteEmpresaId(Long empresaId);
}
