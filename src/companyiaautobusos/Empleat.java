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
public class Empleat extends Persona{
    
    private String numSS;
    private int antiguitat;
    
    Empleat(){}
    Empleat(String numSS, int antiguitat){
        this.numSS=numSS;
        this.antiguitat=antiguitat;
    }

    /**
     * @return the numSS
     */
    public String getNumSS() {
        return numSS;
    }

    /**
     * @param numSS the numSS to set
     */
    public void setNumSS(String numSS) {
        this.numSS = numSS;
    }

    /**
     * @return the antiguitat
     */
    public int getAntiguitat() {
        return antiguitat;
    }

    /**
     * @param antiguitat the antiguitat to set
     */
    public void setAntiguitat(int antiguitat) {
        this.antiguitat = antiguitat;
    }
    
}
