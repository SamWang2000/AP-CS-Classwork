/*
 * Sam Wang
Mr.Daniel
S3C7
You can input a numerical number, and the program will convert it to the English number.
 */
package ConvertNumberSam;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class ConvertNumberSam {

 
public static String num(int a){
    if(a==0)
        return "";
    else if(a%10==0)
        return num(a/10)+"Zero";
    else if(a%10==1)
        return num(a/10)+"One";
    else if(a%10==2)
        return num(a/10)+"Two";
    else if(a%10==3)
        return num(a/10)+"Three";
    else if(a%10==4)
        return num(a/10)+"Four";
    else if(a%10==5)
        return num(a/10)+"Five";
    else if(a%10==6)
        return num(a/10)+"Six";
    else if(a%10==7)
        return num(a/10)+"Seven";
    else if(a%10==8)
        return num(a/10)+"Eight";
    else if(a%10==9)
        return num(a/10)+"Nine";
    else
        return num(a/10)+num(a);
    
}
public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("input number to convert to string");
    int c=input.nextInt();
    System.out.println("string="+num(c));
}
}