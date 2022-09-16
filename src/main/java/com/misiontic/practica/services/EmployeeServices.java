package com.misiontic.practica.services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.misiontic.practica.Interfaces.EmployeeInterface;
import com.misiontic.practica.entities.Empleado;
import com.misiontic.practica.repositories.EmployeeRepository;

@Service

public class EmployeeServices implements EmployeeInterface {

    @Autowired private EmployeeRepository employeeRepository;

    @Override
    public Empleado saveEmpleado(Empleado empleado) {
        // TODO Auto-generated method stub
        return employeeRepository.save(empleado);
    }

    @Override
    public List<Empleado> fetchEmpleadoList() {
        // TODO Auto-generated method stub
        return (List<Empleado>) employeeRepository.findAll();
    }

    @Override
    public Empleado updateEmpleado(Empleado empleado, Long empleadoId) {
        // TODO Auto-generated method stub
        Empleado item = employeeRepository.findById(empleadoId)
                .get();

        if (Objects.nonNull(empleado.getEmail())
                && !"".equalsIgnoreCase(
                        empleado.getEmail())) {
            item.setEmail(
                    empleado.getEmail());
        }
        if (Objects.nonNull(empleado.getProfile())
                && !"".equalsIgnoreCase(
                        empleado.getProfile())) {
            item.setProfile(
                    empleado.getProfile());
        }

        // if (Objects.nonNull(empleado.getRole())
        //         && !"".equalsIgnoreCase(
        //                 empleado.getRole()))) {
        //     item.setRole(
        //             empleado.getRole());
        // }

        // if (Objects.nonNull(empleado.getEnterprise())
        //         && !"".equalsIgnoreCase(
        //                 empleado.getEnterprise())) {
        //     item.setEnterprise(
        //             empleado.getEnterprise());
        // }
        // if (Objects.nonNull(empleado.getTransaction())
        //         && !"".equalsIgnoreCase(
        //                 empleado.getTransaction())) {
        //     item.setTransaction(
        //             empleado.getTransaction());
        // }
        
        
        return employeeRepository.save(item);
    }

    @Override
    public void deleteEmpleadoId(Long empleadoId) {
        // TODO Auto-generated method stub
        employeeRepository.deleteById(empleadoId);
    }

}

