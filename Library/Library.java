package library;

import java.awt.print.Book;
import java.util.Date;
import java.util.Scanner;
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Items b = new Book("12 Rules for Life", "Jordan Peterson", 123, false, new Date(), false);
        b.printDetails();
        
        Items cd = new CDs("And Justice for all", "Metallica", 567, false, new Date(), false);
        cd.printDetails();
        Scanner i = new Scanner(System.in);
        String which = i.nextLine();
        Items x;
        if(which.equalsIgnoreCase("book")){
            x=b;
        }
        else{
            x=cd;
        }
        x.printDetails();
    }
    
}