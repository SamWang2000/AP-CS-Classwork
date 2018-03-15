/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
     public static void main(String[] args){
         List a=new ArrayList();
        a.add(new circle(4,"one"));
        a.add(new circle(2,"Two"));
        a.add(new circle(1,"Three"));
        Collections.sort(a);
        System.out.println(a);
         
     }
    
}
