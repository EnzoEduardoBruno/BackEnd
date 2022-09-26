package com.enzoeduardobruno.eeb.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String timeE;
    private String puestoE;
    private String descripcionE;
    
    //Constructores

    public Experiencia() {
    }

    public Experiencia(String nombreE, String timeE, String puestoE, String descripcionE) {
        this.nombreE = nombreE;
        this.timeE = timeE;
        this.puestoE = puestoE;
        this.descripcionE = descripcionE;
    }
    
    //Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getTimeE() {
        return timeE;
    }

    public void setTimeE(String timeE) {
        this.timeE = timeE;
    }

    public String getPuestoE() {
        return puestoE;
    }

    public void setPuestoE(String puestoE) {
        this.puestoE = puestoE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

}
