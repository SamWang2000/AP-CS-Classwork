/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycleclass;;

/**
 *
 * @author asus
 */
public class Bicycle {
    private int numWheel;
    private String color;
    private String materials;
    
    public Bicycle(int wheels, String colour, String material){
        numWheel = wheels;
        color = colour;
        materials = material;   
    }
    
    public String output(int wheels, String colour, String material){
        if (wheels==2&&colour=="white"&&material=="steel"){
    }
        return "You are riding a bicycle with "+ material +" material and "+ colour
                +" color going forward.";
     
    

    
    }}
