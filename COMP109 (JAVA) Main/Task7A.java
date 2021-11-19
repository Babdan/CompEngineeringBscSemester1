package com.company;
// By Bogdan Itsam Dorantes-Nikolaev, COMP109, Instructor: Prof. Tuna Cakar (November 6th, 2021)

//A program used to demonstrate how a while loop works
public class Task7A {
    public static void main(String[] args) {
        int count = 50;
        while (count < 100) {//repeats the block until count reaches 10
            System.out.println("Hello, World!");
            count+=5;//increments the count
        }
    }
}
