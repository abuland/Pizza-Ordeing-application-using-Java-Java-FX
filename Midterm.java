/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Alyss
 */
public class Midterm extends Application {
    Text header= new Text("Welcome to OOP11 Pizza Mania");
     Button placeorderbtn= new Button("Place Order");
     Button printordersbtn= new Button("Print All Orders"); 
    ArrayList <PizzaOrder> pizzaorder= new ArrayList<>();
  
   
  Label orderdetail= new Label("Your Order Details"); 
  TextArea textarea= new TextArea();
  
    @Override
    public void start(Stage s) {
       
 
    
  // create a menu
  
   Menu menu= new Menu("File");
        // create menuitems
        MenuItem m1 = new MenuItem("Clear");
        MenuItem m2 = new MenuItem("Exit");
        
  
        // add menu items to menu
        menu.getItems().add(m1);
        menu.getItems().add(m2);
      
  
        // create a menubar
        MenuBar mb = new MenuBar();
  
        // add menu to menubar
     mb.getMenus().addAll(menu);
  
        // create a VBox
        VBox vb = new VBox(mb);
   
        m2.setOnAction(e->{
         Platform.exit();
        });
        m1.setOnAction(e->{
          
        });
        
        
  
    
    
    
   Group root= new Group();
    orderdetail.setLayoutX(96);
    orderdetail.setLayoutY(520);
    orderdetail.setFont(Font.font("Ariel", FontWeight.BOLD,14));
    
    
    
    header.setLayoutX(300);
    header.setLayoutY(100);
    header.setFont(Font.font("Ariel", FontWeight.BOLD,14));
    
    
         
     textarea.setPrefHeight(150);
     textarea.setLayoutX(100);
     textarea.setLayoutY(550);
     textarea.setEditable(false);
     
     root.getChildren().addAll(header, printordersbtn,textarea,Toppings());
     root.getChildren().add(vb);
     root.setId("root");
     Scene scene;
        scene = new Scene(root, 850,850);
     scene.setFill(Color.GAINSBORO);
     
   s.setTitle("Pizza Mania");
     s.setScene(scene);
     s.show();  
        
        
    }//end of start method
 
    
    
     public GridPane Toppings(){
        
        GridPane gpane= new GridPane();
        gpane.setHgap(10);
        gpane.setVgap(10);
        gpane.setPadding(new Insets(10,10,10,10));
        
        VBox topping= new VBox();
        Label top= new Label("Each Topping $150");
        gpane.add(top, 10, 15);
        top.setFont(Font.font("Ariel",FontWeight.BOLD,14));
        
        CheckBox ch1= new CheckBox("Tomato");
        gpane.add(ch1, 10, 16);
        
        CheckBox ch2= new CheckBox("Green Pepper");
       gpane.add(ch2, 10, 17);
        
        CheckBox ch3= new CheckBox("Black Olives");
        gpane.add(ch3, 10, 18);
        
        CheckBox ch4= new CheckBox("Mushrooms");
        gpane.add(ch4, 10, 19);
        
        CheckBox ch5= new CheckBox("Extra Cheese");
       gpane.add(ch5, 10, 20);
        
        CheckBox ch6= new CheckBox("Pepperoni");
        gpane.add(ch6, 10, 21);
       
        CheckBox ch7= new CheckBox("Sausage");
       gpane.add(ch7, 10, 22);  
       
        
      
        
        
        VBox ps= new VBox();
        
        Label center= new Label("Pizza Size");
        center.setFont(Font.font("Ariel",FontWeight.BOLD,14));
         gpane.add(center,15, 15);
        
       RadioButton pizzasize1= new RadioButton("Small: $25.00");
        gpane.add(pizzasize1, 15, 16);
       
       
       RadioButton pizzasize2= new RadioButton("Medium: $50.00");
        gpane.add(pizzasize2, 15, 17);
        
        RadioButton pizzasize3= new RadioButton("Large: $75.00");
        gpane.add(pizzasize3, 15, 18);
       
        
        RadioButton pizzasize4= new RadioButton("Family: $130.00");
        gpane.add(pizzasize4, 15, 19);
        
          CheckBox membercard= new CheckBox("Member Card");
        gpane.add(membercard, 15, 20);
        
        VBox pt= new VBox();
        Label left= new Label("Pizza Type");
        left.setFont(Font.font("Ariel", FontWeight.BOLD,14));
        gpane.add(left, 20, 15);
       
        RadioButton pizzatype1= new RadioButton("Thin Crust");
        gpane.add(pizzatype1, 20, 16);
       
        RadioButton pizzatype2= new RadioButton("Medium Crust");
        gpane.add(pizzatype2, 20, 17);
       
        RadioButton pizzatype3= new RadioButton("Crust Lover");
        gpane.add(pizzatype3, 20, 18);
        
        
        
        
        
        
        printordersbtn.setLayoutX(583);
        printordersbtn.setLayoutY(725);
        placeorderbtn.setPrefSize(100, 35);
        gpane.add(placeorderbtn, 15, 22);
        
        
        
        
        placeorderbtn.setOnAction((ActionEvent e) -> {
            if(ch1.isSelected()){
                textarea.appendText("Toppings: "+ch1.getText());
                
            }
            else
                if(ch2.isSelected()){
                    textarea.appendText("\t" + ch2.getText());
                }
                else
                    if(ch3.isSelected()){
                        textarea.appendText("\t" + ch3.getText());
                    }
                    else
                        if(ch4.isSelected()){
                            textarea.appendText("\t" + ch4.getText());
                        }
                        else
                            if(ch5.isSelected()){
                                textarea.appendText("\t" + ch5.getText());
                            }
                            else
                                if(ch6.isSelected()){
                                    textarea.appendText("\t" + ch6.getText());
                                }
    else
if(ch7.isSelected()){
   textarea.appendText("\t" + ch7.getText());
}
            if(pizzasize1.isSelected()){
                textarea.appendText("\n"+"Pizza Size: " + pizzasize1.getText());
            }
            else
                if(pizzasize2.isSelected()){
                    textarea.appendText(pizzasize2.getText());
                }
                else
                    if(pizzasize3.isSelected()){
                        textarea.appendText(pizzasize3.getText());
                    }
                    else
                        if(pizzasize4.isSelected()){
                            textarea.appendText(pizzasize4.getText());
                        }
                      
                            if(pizzatype1.isSelected()){
                                textarea.appendText("\n"+" Pizza Type: "+pizzatype1.getText());
                            }
                            else
                                if(pizzatype2.isSelected()){
                                    textarea.appendText(pizzatype2.getText());
                                }
                                else
                                    if(pizzatype3.isSelected()){
                                        textarea.appendText(pizzatype3.getText());
                                    }
            });
        printordersbtn.setOnAction(e ->{
            
            if(membercard.isSelected()){
                
            }
         
     });
        
        
        
        
         //       element, column index, row index
         gpane.add(printordersbtn, 300, 30);
         
       
       
        return gpane;
     }

    
   
    
   
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }     
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}//end of class
