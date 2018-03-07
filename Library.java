package library;

import java.awt.print.Book;
import java.util.Date;
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Items b = new Book("12 Rules for Life", "Jordan Peterson", 123, false, new Date(), false);
        b.printDetails();
        
        Items cd = new CDs("And Justice for all", "Metallica", 567, false, new Date(), false, "Metal");
        cd.printDetails();
    }
    
}