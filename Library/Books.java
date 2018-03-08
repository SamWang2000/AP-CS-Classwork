package library;

import java.util.Date;

/**
 *
 * @author student-311
 */
public class Books {
     public class Book extends Items{
         private Boolean requested;
        public Book(String Title, String Author_Artist, int Itemid, 
            Boolean Onloan, Date Duedate,Boolean requested){
            super(Title,Author_Artist,Itemid,Onloan,Duedate,requested);
            this.requested = requested;
        }

     public void printDetails(){
         super.printDetails();
         if(requested){
                System.out.println("You can't have it now.");
         }
         else{
             System.out.println("You can have it now.");
         }
     }}}