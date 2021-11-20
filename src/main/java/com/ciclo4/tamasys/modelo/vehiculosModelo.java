/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ciclo4.tamasys.modelo;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Alejandra Moreno Vallejo
 */
@Document(collection="vehiculos")
public class vehiculosModelo {
    
    @Id
    private String id;
    private String docSocio;
    private String docConductor;
    private String placa;
    private String numeroTaxi;
    private String  soat;
    private String  tecnicoMecanica;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDocSocio() {
        return docSocio;
    }

    public void setDocSocio(String docSocio) {
        this.docSocio = docSocio;
    }

    public String getDocConductor() {
        return docConductor;
    }

    public void setDocConductor(String docConductor) {
        this.docConductor = docConductor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNumeroTaxi() {
        return numeroTaxi;
    }

    public void setNumeroTaxi(String numeroTaxi) {
        this.numeroTaxi = numeroTaxi;
    }

    public String getSoat() {
        return soat;
    }

    public void setSoat(String soat) {
        this.soat = soat;
    }

    public String getTecnicoMecanica() {
        return tecnicoMecanica;
    }

    public void setTecnicoMecanica(String tecnicoMecanica) {
        this.tecnicoMecanica = tecnicoMecanica;
    }
}
