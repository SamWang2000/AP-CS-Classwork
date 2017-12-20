/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversesam;


public class ReverseSam {

    
  public static void printString(String s)
{
if (s.length() > 0)
{
printString(s.substring(1));
System.out.print(s.substring(0, 1));
}
}
  public static int reverse (int n)
  {
   System.out.print(n%10);
   if (n/10!=0)
      return  reverse(n/10);
   else
       return n;
  }
  
public static void main( String []args){
    String a= new String("");
    printString(a);
    reverse(32);
}}