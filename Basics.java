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

/* 5. Take 2 numbers as input and print the largest number.

import java.util.*;
public class Basics{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number ");
        float num1 = in.nextFloat();

        System.out.println("Enter the second number ");
        float num2 = in.nextFloat();

        if (num1>num2) {
            System.out.println("First number is largest ");
        } else if (num2>num1){
            System.out.println("Second number is Largest ");
        } else{
            System.out.println("Both the numbers are equal ");
        }
    }
} */

/*6. Input currency in rupees and output in USD.

import java.util.*;
public class Basics{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Indian currency ");
        float inr = in.nextFloat();

        float USD = inr/80;

        System.out.println("The Indian currency in USD is "+USD);
    }
} */

/*7. Find the area of circle

import java.util.*;
public class Basics{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius of the circle ");
        float radius = in.nextFloat();

        double area = (3.14*radius*radius);

        System.out.println("The area of the circle is "+area);
    }
} */

/*8. Write a program to find the area of triangle

import java.util.*;

public class Basics{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Base of the triangle ");
        float base = in.nextFloat();

        System.out.println("Enter the height of the triabgle ");
        float height = in.nextFloat();

        double area = (1.0 /2.0)*base*height;

        System.out.println("Area of the triangle is "+area);
    }
} */

/*9. Write a program in java to find the area of parellelogram.

import java.util.*;

public class Basics{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the base of the parallelogram ");
        float base = in.nextFloat();

        System.out.println("Enter the height of the parallelogram ");
        float height =in.nextFloat();

        float area = base * height;

        System.out.println("The area of the parrellogram is "+area);
    }
} */

/*10. Write a program to find the perimeter of circle .

import java.util.*;

public class Basics{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius of the circle ");
        float radius = in.nextFloat();

        double perimeter = 2*3.14*radius ;

        System.out.println("Perimeter of the circle is "+perimeter);
    }
} */

//11. Write a program to find the perimter of triangle 

import java.util.*;

public class Basics{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first side of triangle");
        float a = in.nextFloat();

        System.out.println("Enter the second side of triangle ");
        float b = in.nextFloat();

        System.out.println("Enter the third side of triangle ");
        float c = in.nextFloat();

        double perimeter = a+b+c;

        System.out.println("The perimeter of the triangle is "+perimeter);
    }
}



