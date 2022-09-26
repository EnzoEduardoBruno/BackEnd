/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enzoeduardobruno.eeb.Dto;

import javax.validation.constraints.NotBlank;

public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String timeE;
    @NotBlank
    private String puestoE;
    @NotBlank
    private String descripcionE;
    
    //Constructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String timeE, String puestoE, String descripcionE) {
        this.nombreE = nombreE;
        this.timeE = timeE;
        this.puestoE = puestoE;
        this.descripcionE = descripcionE;
    }
    //Getters & Setters

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