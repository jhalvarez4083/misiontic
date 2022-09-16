package com.misiontic.practica.entities;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
 
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


 
@NoArgsConstructor
@AllArgsConstructor
@Builder




// Annotations
@Entity
@Getter
@Setter
@Table(name = "enterprise")
public class Empresa extends BaseEntity{
    @Column(unique = true)
    private String name;
    @Column(unique = true)
    private String document;
    
    private String address;
    @OneToMany(mappedBy = "empresa")
    List<Empleado> empleado;

    @OneToMany(mappedBy = "empresa")
    List<Transaction> transactions;

    private String phone;
    private String users;
    private String transaction; 
}