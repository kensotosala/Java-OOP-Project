package Library;

import java.util.ArrayList;

public class Book {

    private String name;         // Title
    private String author;       // Author
    private String publisher;    // Publisher
    private String adress;       // Collection Location
    private String status;       // Borrowing Status
    private int qty;             // Copies for sale
    private double price;        // Price
    private int brwCopies;       // Copies for borrowing

    public Book() {
    }

    public Book(String name, String author, String publisher, String adress, String status, int qty, double price, int brwCopies) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.adress = adress;
        this.status = status;
        this.qty = qty;
        this.price = price;
        this.brwCopies = brwCopies;
    }

    // In the format string:
    // %s is used for string variables.
    // %d is used for integer variables.
    // %.2f is used for floating-point numbers, where .2 specifies that you want two decimal places.
    @Override
    public String toString() {
        String text = "Book Name: " + name
                + "Book Author: " + author
                + "Book Publisher: " + publisher
                + "Book Collection Adress: " + adress
                + "Qty: " + String.valueOf(qty)
                + "Price: " + String.valueOf(price)
                + "Borrowing Copies: " + String.valueOf(brwCopies);
        return text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBrwCopies() {
        return brwCopies;
    }

    public void setBrwCopies(int brwCopies) {
        this.brwCopies = brwCopies;
    }

}
