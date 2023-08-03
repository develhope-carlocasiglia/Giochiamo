package org.example;

public class Student {

    String name;
    String surname;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void printDetails() {
        System.out.println(name + " " + surname);
    }

    public String fullName() {
        return name + " " + surname;
    }

    // gli studenti sanno fare le moltiplicazioni
    public int multiply(int n1, int n2) {
        return n1*n2;
    }

    public void conta(int da, int a) {
        for(int i=da; i<=a; i++) {
            System.out.println(i);
        }
    }

}
