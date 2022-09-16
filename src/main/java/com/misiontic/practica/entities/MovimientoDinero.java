package com.misiontic.practica.entities;

//import java.time.localDate;

public class MovimientoDinero {

    private float montoDelMovimiento;
    private float crearMonto;
    private String conceptoDelMovimiento;
    private String usuario;

    public MovimientoDinero() {
        this.montoDelMovimiento = montoDelMovimiento;
        this.crearMonto = crearMonto;
        this.conceptoDelMovimiento = conceptoDelMovimiento;
        this.usuario = usuario;
    }

    public float getMontoDelMovimiento() {
        return montoDelMovimiento;
    }

    public void setMontoDelMovimiento(float montoDelMovimiento) {
        this.montoDelMovimiento = montoDelMovimiento;
    }

    public float getCrearMonto() {
        return crearMonto;
    }

    public void setCrearMonto(float crearMonto) {
        this.crearMonto = crearMonto;
    }

    public String getConceptoDelMovimiento() {
        return conceptoDelMovimiento;
    }

    public void setConceptoDelMovimiento(String conceptoDelMovimiento) {
        this.conceptoDelMovimiento = conceptoDelMovimiento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "montoDelMovimiento=" + montoDelMovimiento +
                ", crearMonto=" + crearMonto +
                ", conceptoDelMovimiento='" + conceptoDelMovimiento + '\'' +
                ", usuario='" + usuario + '\'' +
                '}';
    }

}