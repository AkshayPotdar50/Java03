package com.java.sprint9;

import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try(BufferedReader br= new BufferedReader(new FileReader("input.txt"))){
            String line;
            while((line= br.readLine()) !=null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }


        try(BufferedWriter br1= new BufferedWriter(new FileWriter("output.txt"))){
            br1.write("hello world");
            br1.newLine();
            br1.write("this is bufferedwriter example");
            br1.flush();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
