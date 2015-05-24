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
public class Persona {
    private String nom;
    private String DNI;
    private String adreca;
    private String telefon;
    private int edat;
    
    Persona(){}
    Persona(String nom, String DNI, String adreca, String telefon, int edat){
        this.nom=nom;
        this.DNI=DNI;
        this.adreca=adreca;
        this.telefon=telefon;
        this.edat=edat;
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
     * @return the DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * @return the adreca
     */
    public String getAdreca() {
        return adreca;
    }

    /**
     * @param adreca the adreca to set
     */
    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    /**
     * @return the telefon
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * @param telefon the telefon to set
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    /**
     * @return the edat
     */
    public int getEdat() {
        return edat;
    }

    /**
     * @param edat the edat to set
     */
    public void setEdat(int edat) {
        this.edat = edat;
    }
    
}
