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
public class vouncher {
    private int id;
    private int descompte;
    public vouncher(){}
    public vouncher(int id, int descompte){
        this.id=id;
        this.descompte=descompte;
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
     * @return the descompte
     */
    public int getDescompte() {
        return descompte;
    }

    /**
     * @param descompte the descompte to set
     */
    public void setDescompte(int descompte) {
        this.descompte = descompte;
    }
    
}
