/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ciclo4.tamasys.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author tamasys
 */
@Document(collection="pagos")
public class pagosModelo {
    
    @Id
    private String id;
    private String idPago;
    private String docSocio;
    private String placa;
    private String fechaPago;
    private String valorPago;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    public String getIdPago() {
        return idPago;
    }

    public String getDocSocio() {
        return docSocio;
    }

    public String getPlaca() {
        return placa;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public String getValorPago() {
        return valorPago;
    }

    public void setIdPago(String idPago) {
        this.idPago = idPago;
    }

    public void setDocSocio(String docSocio) {
        this.docSocio = docSocio;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public void setValorPago(String valorPago) {
        this.valorPago = valorPago;
    }
    
    
}
