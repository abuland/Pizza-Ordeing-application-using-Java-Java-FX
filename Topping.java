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
public class Topping extends Midterm {
    
    private String tomato;
    private String greenpepper;
    private String blackolives;
    private String mushrooms;
    private String extracheese;
    private String pepperoni;
    private String sausage;

    public Topping(String tomato, String greenpepper, String blackolives, String mushrooms, String extracheese, String pepperoni, String sausage) {
        this.tomato = tomato;
        this.greenpepper = greenpepper;
        this.blackolives = blackolives;
        this.mushrooms = mushrooms;
        this.extracheese = extracheese;
        this.pepperoni = pepperoni;
        this.sausage = sausage;
    }
    //Getters for the toppings

    public String getTomato() {
        return tomato;
    }
    
    public String getGreenpepper() {
        return greenpepper;
    }
    
    public String getBlackolives() {
        return blackolives;
    }
    
    public String getMushrooms() {
        return mushrooms;
    }
    
    public String getSausage() {
        return sausage;
    }
    
    public String getExtracheese() {
        return extracheese;
    }
     public String getPepperoni() {
        return pepperoni;
    }
     //Setters for the toppings
    
    public void setTomato(String tomato) {
        this.tomato = tomato;
    }

    

    public void setGreenpepper(String greenpepper) {
        this.greenpepper = greenpepper;
    }

   
    public void setBlackolives(String blackolives) {
        this.blackolives = blackolives;
    }

    

    public void setMushrooms(String mushrooms) {
        this.mushrooms = mushrooms;
    }


    public void setExtracheese(String extracheese) {
        this.extracheese = extracheese;
    }

  

    public void setPepperoni(String pepperoni) {
        this.pepperoni = pepperoni;
    }

   
    public void setSausage(String sausage) {
        this.sausage = sausage;
    }

    @Override
    public String toString() {
        return "Topping{" + "tomato=" + tomato + ", greenpepper=" + greenpepper + ", blackolives=" + blackolives + ", mushrooms=" + mushrooms + ", extracheese=" + extracheese + ", pepperoni=" + pepperoni + ", sausage=" + sausage + '}';
    }
    
    
    
    
    
    
    
    
    
}
