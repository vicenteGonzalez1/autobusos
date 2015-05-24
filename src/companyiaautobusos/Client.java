/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companyiaautobusos;

/**
 *
 * @author yo
 */
public class Client {
    
    private String codiClient;
    
    Client(){}
    Client(String codiClient){
        this.codiClient=codiClient;
    }

    /**
     * @return the codiClient
     */
    public String getCodiClient() {
        return codiClient;
    }

    /**
     * @param codiClient the codiClient to set
     */
    public void setCodiClient(String codiClient) {
        this.codiClient = codiClient;
    }
         
    
}
