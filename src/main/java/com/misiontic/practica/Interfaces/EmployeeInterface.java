package com.misiontic.practica.Interfaces;

import java.util.List;

import com.misiontic.practica.entities.Empleado;




public interface EmployeeInterface {
    // Save operation
    Empleado saveEmpleado(Empleado empleado);
 
    // Read operation
    List<Empleado> fetchEmpleadoList();
 
    // Update operation
    Empleado updateEmpleado(Empleado empleado,
                                Long empleadoId);
 
    // Delete operation
    void deleteEmpleadoId(Long empleadoId);
}
