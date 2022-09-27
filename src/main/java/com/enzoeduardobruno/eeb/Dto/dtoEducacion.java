/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.enzoeduardobruno.eeb.Dto;

import javax.validation.constraints.NotBlank;

public class dtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
        @NotBlank
    private String timeE;
    @NotBlank
    private String tituloE;
    private String descripcionE;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String descripcionE) {
        this.nombreE = nombreE;
        this.timeE = timeE;
        this.tituloE = tituloE;
        this.descripcionE = descripcionE;
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
    
        public String getTituloE() {
        return tituloE;
    }

    public void setTituloE(String tituloE) {
        this.tituloE = tituloE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
    
    
}