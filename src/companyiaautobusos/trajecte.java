/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companyiaautobusos;

import java.util.Date;

/**
 *
 * @author yo
 */
public class trajecte {
    private String origen;
    private String destinacio;
    private Date dataSortida;
    private Date dataArribada;
    
    trajecte(){}
    trajecte(String origen, String destinacio, Date dataSortida, Date dataArribada){
        this.origen=origen;
        this.destinacio=destinacio;
        this.dataSortida=dataSortida;
        this.dataArribada=dataArribada;
    }

    /**
     * @return the origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * @return the destinacio
     */
    public String getDestinacio() {
        return destinacio;
    }

    /**
     * @param destinacio the destinacio to set
     */
    public void setDestinacio(String destinacio) {
        this.destinacio = destinacio;
    }

    /**
     * @return the dataSortida
     */
    public Date getDataSortida() {
        return dataSortida;
    }

    /**
     * @param dataSortida the dataSortida to set
     */
    public void setDataSortida(Date dataSortida) {
        this.dataSortida = dataSortida;
    }

    /**
     * @return the dataArribada
     */
    public Date getDataArribada() {
        return dataArribada;
    }

    /**
     * @param dataArribada the dataArribada to set
     */
    public void setDataArribada(Date dataArribada) {
        this.dataArribada = dataArribada;
    }
    
    
}
