package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Book> listOfBooks = new ArrayList<>();
    private int cardId =0;
    Book book;
    public Cart() {
        cardId++;
    }
    public List<Book> getListOfBooks() {
        return listOfBooks;
    }
    public void setListOfBooks(List<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }
    public static String addBook(String bookName) {
        Book book=new Book();
        String r="";
       if( Book.searchBook(bookName)!=null)
       {
        r= book.getName()+"/"+ book.getSubject()+"/"+ book.getAuthor()+"/";
       }
        else
            {
            r="book not available";
        }
         return r;
    }
}



