/*1. Write a program to print whether a number is even or odd, also take input from the user.

import java.util.*;

public class Basics{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number ");
        int num = in.nextInt();

        if(num%2==0){
            System.out.println("Number is even ");
        } else {
            System.out.println("NUmber is odd");
        }
    }
} */

//2. Take name as input and print a greeting message for that particular name.

import java.util.*;
public class Basics{
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       System.out.println("Enter your name ");
       String name = in.next();

       System.out.println("Hello "+ name);
    }
}

