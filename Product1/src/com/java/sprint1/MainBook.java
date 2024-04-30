package com.java.sprint1;

import java.util.Arrays;
import java.util.List;

class Book {
    private String tittle;
    private String author;
    private int year;
    private double price;

    public Book(String tittle, String author, int year, double price) {
        this.tittle = tittle;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MainBook{" +
                "tittle='" + tittle + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}

public class MainBook{
    public static void main(String[] args) {
        List<Book> books= Arrays.asList(
                new Book("java 8 in action", "akshay potddar", 2014, 40),
                new Book("effective java", "joshua bloch", 2008, 35.0),
                new Book("clean code", "robert c", 2008, 35.0),
                new Book("the programmer", "andrew hunt", 1999, 50)
        );

        //print tittles of books published after 2003
        books.stream().filter(book->book.getYear()>2003).map(Book::getTittle).forEach(System.out::println);
        System.out.println("*************************************************");
        //print books which tittle contains java
        books.stream().map(Book::getTittle).filter(tittle -> tittle.contains("java")).forEach(System.out::println);
        System.out.println("*********************************************");

        //apply certain discount on each price and print it
        books.stream().map(book->book.getPrice()*0.80).forEach(System.out::println);



    }

}
