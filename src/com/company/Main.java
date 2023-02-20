package com.company;

import java.util.*;


public class Main {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
       getBook();
        getCustomer();
         Book book = Book.searchBook("j");
    }
 /*   public static void insertData()
    {
        for (int i = 0; i < 4; i++)
        {
            if (Customer.customers == null)
            {
                Customer.customers = new ArrayList<>();
            }
            Customer customer=new Customer();
            customer.setFirsName("name-"+i);
            customer.setLastName("Lname-"+i);
            customer.setCardNumber("2121212121211"+i);
        }
        for (int i = 0; i < 5; i++)
        {
            Book book = new Book();
            book.setISBN(i + "");
            Author author = new Author();
            author.setFirstName("Auther-" + i);
            book.setAuthor(author);
            book.setName("book-" + i);
            book.setSubject("subject-" + i);
            Author.addAuthor(author);
            Book.addBook(book);
        }
    }
*/
    public static  void getBook()
    {
        System.out.println("please inter Book name");
        String bookName = s.next();
        System.out.println("please inter Subject name");
        String subject = s.next();
        System.out.println("please inter ISBN name");
        String isbn = s.next();
        System.out.println("please inter Author name");
        String authorName = s.next();
        Author author1 = new Author();
        author1.setFirstName(authorName);
        Book  book1=new Book();
        book1.setName(bookName);
        book1.setSubject(subject);
        book1.setISBN(isbn);
        book1.setAuthor(author1);
    }
   public static void getCustomer() {
        System.out.println("please inter first name");
        String firstName = s.next();
        System.out.println("please inter last name");
        String lastName = s.next();
        System.out.println("please inter cardNumber");
        String cardNumber = s.next();
        Customer customer = new Customer();
        customer.setFirsName(firstName);
        customer.setLastName(lastName);
        customer.setCardNumber(cardNumber);
        System.out.println("please inter bookname");
        String nameOfBook = s.next();
        Customer.addToCard(customer, nameOfBook);
    }
    //   System.out.println("do you insert more Curd number please enter 1 ");
    //   int insertMore = s.nextInt();
    //   if (insertMore == 1) {
    //        System.out.println("please inter cardNumber");
    //       cardNumber = s.next();
    //       customer.setCard(card);
    //       card.setCardNumber(cardNumber);


    public static void showBooks() {
        if (Book.showOfBooks().isEmpty()) {
            System.out.println("list is empty");
        } else {
            System.out.println(Book.showOfBooks());
        }
    }

    public static void showAuthor() {
        if (Author.showofAuthor().isEmpty()) {
            System.out.println("list is empty");
        } else {
            System.out.println(Author.showofAuthor());
        }
    }



        /* System.out.println(book1.toString());
        Scanner s=new Scanner(System.in);
        System.out.println("which method would you call");
        System.out.println(" if you  call isprime please enter 1");
        System.out.println("if you call symmetrical please enter 2");
        System.out.println("if you call arryOfIsPrime please enter 3");
        System.out.println("if you call line please enter 4");
        int select=s.nextInt();
         if(select==1) {
             System.out.println("please enter a number");
             int number=s.nextInt();
            if(isPrime(number))
            {
                System.out.println(number+"is prime");
            }
            else
            {

                System.out.println(number+"is not prime");
            }
         }
        if(select==2 )
        {
            System.out.println("please enter a  number");
            int numbe1=s.nextInt();
            isPrime(numbe1);
        }
        if(select==3)
        {
            System.out.println("please enter a  number");
             int numbe1=s.nextInt();
            arryOfIsPrime(numbe1);
        }
        if(select==4)
        {
            System.out.println("please enter a  number");
           // int numbe1=s.nextInt();
            readFile("|WD|412545425|85|");
        }*/

    public static void arryOfIsPrime(int n) {
        int[] arrayOffice = new int[n - 1];
        int targetIndex = 0;
        for (int i = 1; i < n; i++) {
            if (isPrime(i)) {
                arrayOffice[i] = i;
                targetIndex++;
            }
        }
        int[] newArray = new int[targetIndex];
        for (int i = 0, j = 0; i < arrayOffice.length; i++) {
            if (arrayOffice[i] != 0) {
                newArray[j] = arrayOffice[i];
                j++;
            }
        }
        System.out.println("numbers is prime" + Arrays.toString(newArray));
    }
    public static Boolean isPrime(int n) {
        boolean result = false;
        int j = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                j++;
                if (j == 3) {
                    result = false;
                    break;
                } else {
                    result = true;
                }
            }
        }
        return result;
    }
    public static void symmetrical(String s) {
        Boolean resultOfWord = null;
        int count = s.length();
        char s6[] = new char[s.length()];
        s6 = s.toCharArray();

        for (int i = 0; i < count; i++) {
            if (s6[i] == s6[count - 1]) {
                resultOfWord = true;
            } else {
                resultOfWord = false;
            }
        }
        if (resultOfWord) {
            System.out.println("word is symmetrical ");
        } else {
            System.out.println("word isnot symmetrical ");
        }
    }
    public static void readFile(String str) {
        String[] line = str.split("\\|");
        for (int i = 0; i < line.length; i++) {
            System.out.println(line[i]);
        }
    }

}



