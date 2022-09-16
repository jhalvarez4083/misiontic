package com.misiontic.practica.services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.misiontic.practica.Interfaces.EnterpriseInterface;
import com.misiontic.practica.entities.Empresa;
import com.misiontic.practica.repositories.EnterprisesRepository;

@Service

public class EnterpriseServices implements EnterpriseInterface {

    @Autowired private EnterprisesRepository enterprisesRepository;

    @Override
    public Empresa saveEmpresa(Empresa empresa) {
        // TODO Auto-generated method stub
        return enterprisesRepository.save(empresa);
    }

    @Override
    public List<Empresa> fetchEmpresaList() {
        // TODO Auto-generated method stub
        return (List<Empresa>) enterprisesRepository.findAll();
    }

    @Override
    public Empresa updateeEmpresa(Empresa empresa, Long empresaId) {
        // TODO Auto-generated method stub
        Empresa item = enterprisesRepository.findById(empresaId)
                .get();

        if (Objects.nonNull(empresa.getName())
                && !"".equalsIgnoreCase(
                        empresa.getName())) {
            item.setName(
                    empresa.getName());
        }
        if (Objects.nonNull(empresa.getAddress())
                && !"".equalsIgnoreCase(
                        empresa.getAddress())) {
            item.setAddress(
                    empresa.getAddress());
        }

        if (Objects.nonNull(empresa.getPhone())
                && !"".equalsIgnoreCase(
                        empresa.getPhone())) {
            item.setPhone(
                    empresa.getPhone());
        }

        if (Objects.nonNull(empresa.getDocument())
                && !"".equalsIgnoreCase(
                        empresa.getDocument())) {
            item.setDocument(
                    empresa.getDocument());
        }
        if (Objects.nonNull(empresa.getUsers())
                && !"".equalsIgnoreCase(
                        empresa.getUsers())) {
            item.setUsers(
                    empresa.getUsers());
        }
        if (Objects.nonNull(empresa.getTransaction())
                && !"".equalsIgnoreCase(
                        empresa.getTransaction())) {
            item.setTransaction(
                    empresa.getTransaction());
        }
        
        return enterprisesRepository.save(item);
    }

    @Override
    public void deleteEmpresaId(Long empresaId) {
        // TODO Auto-generated method stub
        enterprisesRepository.deleteById(empresaId);
    }

}
