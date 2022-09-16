package com.misiontic.practica.entities;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.misiontic.practica.Enums.Enum_RoleName;

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
@Table(name = "employee")
public class Empleado extends BaseEntity{
    @Column(unique = true)
    private String email;
    // @Column(unique = true)
    // private String profile;
    @Column(name = "role")
    @Enumerated(value = EnumType.STRING)
    private Enum_RoleName role;

    @OneToOne(mappedBy = "empleado")
    private Profile profile;

    @ManyToOne
    @JoinColumn(name = "empresa")
    private Empresa empresa;

    @OneToMany(mappedBy = "empleado")
    List<Transaction> transactions;
    
     
}
    //Método para modificar los datos del empleado