/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author Administrator
 */
public class Shapes {

    /**
     * @param args the command line arguments
     */
     public abstract class shapes{
    private String name;
    
    public shapes (String shapeName){
        name = shapeName;
    }
    public String getName(){
        return name;
    }
    public abstract double area();
    public abstract double perimeter();
    
    public double semiArea(){
        return area()/2;
    }
    
}
    
}
