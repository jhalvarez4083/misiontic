package com.misiontic.practica.entities;


// import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "transaction")
public class Transaction extends BaseEntity{
    // @Column(unique = true)
    private String concept;
    // @Column(unique = true)
    private Float amount;
    @ManyToOne
    @JoinColumn(name = "empleado")
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "empresa")
    private Empresa empresa;
   
    
}