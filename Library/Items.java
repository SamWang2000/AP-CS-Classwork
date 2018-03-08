package library;

import java.util.Date;

/**
 *
 * @author student-311
 */
public class Items {
    private String title;
    private String author_artist;
    private int itemID;
    private Boolean onloan;
    private Date dueDate;
    private Boolean requested;
    
    public Items(String Title, String Author_Artist, int Itemid, 
            Boolean Onloan, Date Duedate, Boolean requested){
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
    public Boolean requested(){
        return requested;
    }
    public void printDetails(){
        System.out.println("title"+title+"\n"+"author:"+author_artist+"reference number"+itemID);
        if(onloan)
            System.out.println("This book can be loaned");
        else
            System.out.println("This book cannot be loaned");   
    }
   
    
}