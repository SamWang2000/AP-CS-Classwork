/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.awt.print.Book;
import java.util.Date;
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book b = new Book("12 Rules for Life","Jordan Peterson","X123",
                false,new Date(),false);
        b.printDetails();
        CD cd = new CD("And Justice for all","Metallica","X567".false,new Date()
                ,false,"Metal");
        cd.printDetails();
    }
    
}
