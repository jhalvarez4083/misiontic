package com.misiontic.practica.entities;

import javax.persistence. *;

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
@Table(name = "profile")
public class Profile extends BaseEntity{
    
    @Column(name = "image")
    private String image;

    @Column(name = "phone")
    private String phone;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    private Empleado empleado;

    
}
