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

/*2. Take name as input and print a greeting message for that particular name.

import java.util.*;
public class Basics{
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       System.out.println("Enter your name ");
       String name = in.next();

       System.out.println("Hello "+ name);
    }
} */

/*3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.*;
public class Basics{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the principal amount ");
        float P = in.nextFloat();

        System.out.println("Enter the Time period in years ");
        float T = in.nextFloat();

        System.out.println("Enter the rate of initerest in percentage ");
        float R = in.nextFloat();

        float si = (P*R*T)/100;

        System.out.println("The Simple Interest of the given data is "+ si);
    }
} */

/*4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.*;

public class Basics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float ans=0;

        System.out.println("Enter the first number ");
        float num1 = in.nextFloat();

        System.out.println("Enter the second number ");
        float num2 = in.nextFloat();

        System.out.println("Enter the operator which you eant to perform between the numbers ");
        char op = in.next().charAt(0);

        if (op == '+') {
            ans = num1 + num2;
        } else if (op == '-') {
            ans = num1 - num2;
        } else if (op == '*') {
            ans = num1 * num2;
        } else if(op=='/'){
            ans= num1/num2;
        } else if(op=='%'){
            ans = num1%num2;
        } else{
            System.out.println("Invalid operator ");
        }
        System.out.println(ans);
    }

} */


