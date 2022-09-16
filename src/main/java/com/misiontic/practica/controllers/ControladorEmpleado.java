package com.misiontic.practica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.misiontic.practica.entities.Empleado;
import com.misiontic.practica.services.EmployeeServices;

@RestController
public class ControladorEmpleado {
	@Autowired private EmployeeServices employeeServices;

	@PostMapping("/employee")
	public Empleado saveEmpleado(
			@Validated @RequestBody Empleado empleado) {
		return employeeServices.saveEmpleado(empleado);
	}

	@GetMapping("/employee")
	public List<Empleado> fetchEmpresatList() {
		return employeeServices.fetchEmpleadoList();
	}

 
	// Update operation
	@PutMapping("/employee/{id}")
	public Empleado updateEmpleado(@RequestBody Empleado empleado,
			@PathVariable("id") Long empleadoId) {
		return employeeServices.updateEmpleado(
				empleado, empleadoId);
	}

	// Delete operation
	@DeleteMapping("/employee/{id}")
	public String deleteId(@PathVariable("id") Long empleadoId) {
		employeeServices.deleteEmpleadoId(
				empleadoId);
		return "Deleted Successfully";
	}
}