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
public class Reserva {
    private int id_trajecte;
    private Date dia;
    private int id_client;
    
    Reserva(){}
    Reserva(int id_trajecte, Date dia, int id_client){
        this.id_trajecte=id_trajecte;
        this.dia=dia;
        this.id_client=id_client;
    }

    /**
     * @return the id_trajecte
     */
    public int getId_trajecte() {
        return id_trajecte;
    }

    /**
     * @param id_trajecte the id_trajecte to set
     */
    public void setId_trajecte(int id_trajecte) {
        this.id_trajecte = id_trajecte;
    }

    /**
     * @return the dia
     */
    public Date getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(Date dia) {
        this.dia = dia;
    }

    /**
     * @return the id_client
     */
    public int getId_client() {
        return id_client;
    }

    /**
     * @param id_client the id_client to set
     */
    public void setId_client(int id_client) {
        this.id_client = id_client;
    }
}
