//* William Lu. S3C7. Mr.Daniel. Sep.24th.This program is designed to evaluate whether the girl meets the standard./

package GirlfriendSam;
import java.util.Scanner;
public class GirlfriendSam {

   public static void main(String[] args) {
   Scanner input1= new Scanner (System.in);
   System.out.println("What is your gender?");
 
            String name= input1.nextLine();
            if (name.compareToIgnoreCase("Female")!=0)
                System.out.println("Congratulation, you can go on. ");
            else{
                System.out.println("Sorry, you are the wrong person. ");
   Scanner input2= new Scanner (System.in);
   System.out.println("What is your height? (centimeters) ");
   double height=input2.nextDouble();
   if (height<=150){
        System.out.println("Sorry, you are not my girlfriend.");
   }else if(height>=180){
        System.out.println("Sorry, you are too tall.");
   }else{
        System.out.println("What is your weight? (kilograms) ");
   Scanner input3= new Scanner (System.in);
   double weight=input3.nextDouble();
   if (weight<=40){
        System.out.println("Sorry, you are not my girlfriend.");
   }else if(weight>=80){
        System.out.println("Sorry, you are too fat.");
   }else{
                
            Scanner input4=new Scanner (System.in);
    System.out.println("You like wathing movie? True or False.");
    boolean bas=input3.nextBoolean();
        if (bas==false){
            System.out.println("Sorry.");
        }
        else if (bas==true){
            System.out.println("What is my Chinese name? ");
            Scanner input5= new Scanner (System.in);
            String name1= input5.nextLine();
            if (name.compareToIgnoreCase("王子涵")!=0)
                System.out.println("I hate my name being mispelled.");
            else{
                System.out.println("So nice to meet you but one last question.");
        
                
                
            Scanner input6=new Scanner (System.in);
            System.out.println("Are you good at cooking?");
            String cooking=input6.nextLine();
                if (cooking.compareToIgnoreCase("Yes")==0)
                      System.out.println("Hi,my girlfriend.");
                else{
                      System.out.println("Good bye.");}}}}}}}}
 
   
   
   

   