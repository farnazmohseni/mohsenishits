package com.company;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String ISBN;
    private String name;
    private String subject;
    private Author author;
    static List<Book> listofBooks = new ArrayList<>();

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", author=" + author.toString() +
                '}';
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public static boolean checkISBN(String account) {
        boolean result = false;
        char[] acc = account.toCharArray();
        int newacc = 0;
        for (int i = 0, j = 10; i < 10; i++) {
            newacc += Character.getNumericValue(acc[i]) * j;
            j--;
        }
        if (newacc % 11 == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static boolean addBook(Book book) {
        boolean result = false;
        if (true) { //checkISBN(book.getISBN());
            if (listofBooks.isEmpty()) {
                listofBooks.add(book);
                result = true;
            } else {
                for (int i = 0; i < listofBooks.size(); i++) {
                    String myBook = book.getISBN();
                    String myList = listofBooks.get(i).getISBN();
                    if (myBook.equals(myList)) {
                        result = false;
                    } else {
                        listofBooks.add(book);
                        result = true;
                    }
                }
            }
        }
        return result;
    }

    public static List<Book> showOfBooks() {

        for (int i = 0; i < listofBooks.size(); i++) {
            listofBooks.get(i);
        }
        return listofBooks;
    }
    public  static Book searchBook(String bookName)
    {
        for(int i=0; i<listofBooks.size();i++)
        {
            if(listofBooks.get(i).getName()==bookName) {
                return listofBooks.get(i);}

        }
        return  null;
    }
}
