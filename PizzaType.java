/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;

/**
 *
 * @author Alyss
 */
public class PizzaType extends Midterm {
    private String thincrust;
    private String mediumcrust;
    private String crustlover;

    public PizzaType(String thincrust, String mediumcrust, String crustlover) {
        this.thincrust = thincrust;
        this.mediumcrust = mediumcrust;
        this.crustlover = crustlover;
    }

    public String getThincrust() {
        return thincrust;
    }

    public void setThincrust(String thincrust) {
        this.thincrust = thincrust;
    }

    public String getMediumcrust() {
        return mediumcrust;
    }

    public void setMediumcrust(String mediumcrust) {
        this.mediumcrust = mediumcrust;
    }

    public String getCrustlover() {
        return crustlover;
    }

    public void setCrustlover(String crustlover) {
        this.crustlover = crustlover;
    }

    @Override
    public String toString() {
        return "PizzaType{" + "thincrust=" + thincrust + ", mediumcrust=" + mediumcrust + ", crustlover=" + crustlover + '}';
    }
    
    
    
    
    
    
    
}
