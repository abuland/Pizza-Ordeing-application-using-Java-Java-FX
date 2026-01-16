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
public class PizzaSize extends Midterm {
    
    private String small;
    private String medium;
    private String large;
    private String family;

    public PizzaSize(String small, String medium, String large, String family) {
        this.small = small;
        this.medium = medium;
        this.large = large;
        this.family = family;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "PizzaSize{" + "small=" + small + ", medium=" + medium + ", large=" + large + ", family=" + family + '}';
    }
    
    
    
    
    
    
    
    
    
}
