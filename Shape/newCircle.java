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
public class circle {
    public abstract class shapes{
    private String name;
    private double radius;
    
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
    public class newCircle extends shapes{
    private double radius;
    private String name;
    public newCircle (double circleRadius, String circleName){
        super(circleName);
        radius = circleRadius;
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
    public double area(){
         return Math.PI * radius * radius;
    }
    public String getName(){
        return name;
    }
    public boolean equals(newCircle obj){
        return (this.name==obj.getName());
    }
    public String toString(){
         return "circle compare{"+this.radius+"}";
    }
    
}
    public class square extends shapes{
        private double sides;
        private double squareSides;
        public square (double suqareSides, String suqareName){
            super(suqareName);
            sides = squareSides;
        }
        public double perimeter(){
            return 4 * sides;
        }
        public double area(){
            return sides*sides;
        }
        
    }
    public class triangle extends shapes{
        private double sides;
        public triangle (double triangleSides, String triangleName){
            super(triangleName);
            sides = triangleSides;
        }
        public double perimeter(){
            return 3 * sides;
        }
        public double area(){
            return (sides * sides)/2;
        }
        
        
    }
    
}
