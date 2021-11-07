/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ciclo4.tamasys.modelo;

import java.util.Date;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author tamasys
 */
@Document(collection="pagos")
public class pagosModelo {
    
    @Id
    private ObjectId id;
    private String idPago;
    private String docSocio;
    private String placa;
    private Date fechaPago;
    private String valorPago;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
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

    public Date getFechaPago() {
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

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public void setValorPago(String valorPago) {
        this.valorPago = valorPago;
    }
    
    
}
