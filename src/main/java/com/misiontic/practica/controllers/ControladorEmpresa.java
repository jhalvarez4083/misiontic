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

import com.misiontic.practica.entities.Empresa;
import com.misiontic.practica.services.EnterpriseServices;

@RestController
public class ControladorEmpresa {
	@Autowired private EnterpriseServices enterpriseServices;

	@PostMapping("/enterprises")
	public Empresa saveEmpresa(
			@Validated @RequestBody Empresa empresa) {
		return enterpriseServices.saveEmpresa(empresa);
	}

	@GetMapping("/enterprises")
	public List<Empresa> fetchEmpresatList() {
		return enterpriseServices.fetchEmpresaList();
	}

 
	// Update operation
	@PutMapping("/enterprises/{id}")
	public Empresa updateEmpresa(@RequestBody Empresa empresa,
			@PathVariable("id") Long empresaId) {
		return enterpriseServices.updateeEmpresa(
				empresa, empresaId);
	}

	// Delete operation
	@DeleteMapping("/enterprises/{id}")
	public String deleteId(@PathVariable("id") Long empresaId) {
		enterpriseServices.deleteEmpresaId(
				empresaId);
		return "Deleted Successfully";
	}
}
