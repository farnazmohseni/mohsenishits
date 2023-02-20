package com.company;

import javax.smartcardio.Card;
import java.util.List;

public class Customer {
    private String firsName;
    private String lastName;
    private String cardNumber;

    private Cart cart;
    public static List<Customer> customers;

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart card) {
        this.cart = card;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", card=" + cart +
                '}';
    }
    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static void addToCard(Customer customer, String book) {
        customer.getCart();
        Cart.addBook(book);
    }
    public static Customer searchBook(String custName) {
        for (int i = 0; i <customers .size(); i++) {
            if (customers.get(i).getFirsName() == custName) {
                return   customers.get(i);
            }
        }
        return null;
    }
}
