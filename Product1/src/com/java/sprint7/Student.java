package com.java.sprint7;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return id;
    }

    public static void main(String[] args) {
        Set<Student> studentSet= new HashSet<>();

        Student student1= new Student("akshay",1);
        Student student2= new Student("ashish",2);
        Student student3= new Student("akash",3);
        Student student4= new Student("akshata",4);

        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);
        System.out.println("unique students based on id");
        for(Student student: studentSet){
            System.out.println("name "+student.getName()+ " id "+student.getId());
            
        }


    }
}
