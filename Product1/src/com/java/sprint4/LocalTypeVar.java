package com.java.sprint4;

import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

class Person{
    private String fname;
    private String lname;

    public Person(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }
}

public class LocalTypeVar {
    public static void main(String[] args) {

        var Roland = new Person("Roland","Potdar");
        var susan = new Person("susan","patil");
        var Eddie = new Person("Eddie","kamble");
        var Detta = new Person("Detta","lad");
        var Jake = new Person("Jake","satpute");
        var Persons= List.of(Roland, susan, Eddie, Detta, Jake);

        for(var Person: Persons){
            System.out.println(Person.getFname()+"-"+Person.getLname());
        }
        System.out.println("**************************************************");

        var filtered=Persons.stream().filter((var x)->x.getFname().contains("R")).toList();
        System.out.println(filtered);
        System.out.println("****************************************************");



        //SWITCH EXPRESSION
        int days=0;
        Month month= Month.APRIL;

        days=switch (month){
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER ->31;
            case FEBRUARY -> 28;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER ->30;
            default -> throw new IllegalStateException();
        };

        System.out.println("number of days in month"+month+" :"+days);
        System.out.println("*********************************************");


        //using a textblock
        System.out.println(
                """
                        <!DOCTYPE html>
                                        <html>
                                            <head>
                                                <title>Example</title>
                                            </head>
                                            <body>
                                                <p>This is an example of a simple HTML\s
                                                page with one paragraph.</p>
                                            </body>
                                        </html>\s
                        """
        );
    }
}
