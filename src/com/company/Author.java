package com.company;


import java.util.ArrayList;
import java.util.List;

public class Author {
    private String firstName;

    static List<Author> authors = new ArrayList<>();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static boolean addAuthor(Author author) {
        boolean result = false;
        if (authors.isEmpty()) {
            authors.add(author);
            //authors=new List(author.setFirstName(););

            result = true;
        } else {
            for (int i = 0; i < authors.size(); i++) {
                String myathor = authors.get(i).getFirstName();
                String myobject = author.getFirstName();
                if (myathor.equals(myobject)) {
                    result = false;
                    break;
                } else {
                    authors.add(author);
                    result = true;
                    break;
                }
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                '}';
    }

    public static List<Author> showofAuthor() {
        for (int i = 0; i < authors.size(); i++) {
            authors.get(i);
        }
        return authors;
    }

    public static Author searchBook(String authorName) {
        for (int i = 0; i <authors .size(); i++) {
            if (authors.get(i).getFirstName() == authorName) {
                return authors.get(i);
            }

        }
        return null;
    }
}


