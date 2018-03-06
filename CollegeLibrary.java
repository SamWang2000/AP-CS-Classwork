/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.Date;

/**
 *
 * @author student-311
 */
public class CollegeLibrary {
    private String title;
    private String author_artist;
    private int itemID;
    private Boolean onloan;
    private Date dueDate;
    
    public CollegeLibrary(String Title, String Author_Artist, int Itemid, 
            Boolean Onloan, Date Duedate){
        Title = title;
        Author_Artist = author_artist;
        Itemid = itemID;
        Onloan = onloan;
        Duedate = dueDate;
    }
    
    public String GetTitle(){
   return title;
}
    public String GetAuthor_Artist(){
        return author_artist;
    }
    public int GetItemID(){
        return itemID;
    }
    public Boolean Onloan(){
        return onloan;
    }
    public Date DueDate(){
        return dueDate;
    }
    public class Book extends CollegeLibrary{
        public Book(String Title, String Author_Artist, int Itemid, 
            Boolean Onloan, Date Duedate){
            super(Title,Author_Artist,Itemid,Onloan,Duedate);
        }
    
}
    
}

