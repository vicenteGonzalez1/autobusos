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
public class snack {
    private int id;
    private int preu;
    private String nom;
    private String descripcio;
    public snack(){};
    public snack(int id, int preu, String nom, String descripcio){
        this.id=id;
        this.preu=preu;
        this.nom=nom;
        this.descripcio=descripcio;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the preu
     */
    public int getPreu() {
        return preu;
    }

    /**
     * @param preu the preu to set
     */
    public void setPreu(int preu) {
        this.preu = preu;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the descripcio
     */
    public String getDescripcio() {
        return descripcio;
    }

    /**
     * @param descripcio the descripcio to set
     */
    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }
    
}
