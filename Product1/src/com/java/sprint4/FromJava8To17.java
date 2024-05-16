package com.java.sprint4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Car{
    private String model;
    private int yearOfPurchase;

    public Car(String model, int yearOfPurchase) {
        this.model = model;
        this.yearOfPurchase = yearOfPurchase;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfPurchase() {
        return yearOfPurchase;
    }

    public void setYearOfPurchase(int yearOfPurchase) {
        this.yearOfPurchase = yearOfPurchase;
    }
}

//try with resources
//1.closing resources with manual finelly block
class TryWithResources{
    public static void main(String[] args) {
        BufferedReader br= new BufferedReader(
                new StringReader("Hello world example")
        );
        try{
            System.out.println(br.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                br.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        //closing resources with try-with-resource
        final BufferedReader br3= new BufferedReader(
                new StringReader("Hello i am akshay")
        );
        try (BufferedReader reader=br3){
            System.out.println(reader.readLine());
        }catch (IOException e){
            System.out.println("error happened");
        }
    }
}



//diamond syntax with inner anonymous class

class DiamondOperator{
    StringAppender<String> appending = new StringAppender<String>() {
        @Override
        public String append(String s, String b) {
            return new StringBuilder(s).append("-").append(b).toString();
        }
    };

}

abstract class StringAppender<T>{
    public abstract T append(String s, String b);
}

public class FromJava8To17 {

    List<String> cars= new ArrayList<>();
    //1.LAMBDA EXPRESSION
    public static List<Car> findCarsUsingLamda(List<Car>cars){
        return cars.stream().filter(car->car.getYearOfPurchase()>2005).collect(Collectors.toList());
    }

    
}


