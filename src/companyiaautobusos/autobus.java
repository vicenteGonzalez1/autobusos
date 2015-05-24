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
public class autobus {
    private String matricula;
    private int id_trajeccte;
    private int max_cap;
    private String model;
    
    autobus(){}
    autobus(String matricula, int id_trajecte, int max_cap, String model){
        this.matricula=matricula;
        this.id_trajeccte=id_trajecte;
        this.max_cap=max_cap;
        this.model=model;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the id_trajeccte
     */
    public int getId_trajeccte() {
        return id_trajeccte;
    }

    /**
     * @param id_trajeccte the id_trajeccte to set
     */
    public void setId_trajeccte(int id_trajeccte) {
        this.id_trajeccte = id_trajeccte;
    }

    /**
     * @return the max_cap
     */
    public int getMax_cap() {
        return max_cap;
    }

    /**
     * @param max_cap the max_cap to set
     */
    public void setMax_cap(int max_cap) {
        this.max_cap = max_cap;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }
    
}
