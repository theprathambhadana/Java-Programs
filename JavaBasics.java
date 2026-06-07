import java.util.Scanner;;
public class JavaBasics{
    public static void main(String args[]){

//Variables and DataTypes


       // System.out.println("this is my first java program yeaahhh");
        //System.out.println("in this we are making a pattern of stars\nand here it goesssss \n");
        //System.out.println("*****");
        //System.out.println("****");
        //System.out.println("***");
       // System.out.println("**");
       // System.out.println('*');
       // System.out.println(" \n");
       // System.out.println("THIS IS IT!!!!!0");       
        
        //Output in java
       // System.out.print("hello world");      
        //System.out.print("hello world");
        //output = hello worldhello world

       // System.out.println("hello world");
       // System.out.println("hello world");
        //output = hello world
        //output = hello world

       // System.out.print("hello world\n");
        //System.out.print("hello world\n");
        //System.out.print("hello world\n");
        //output = hello world
        //output = hello world
        //output = hello world



        //variavle in java
        //int a = 26;
       // byte b = 8;
        //short c = 16;
       // long d = 1234567890L;
        //float e = 3.14f;
        //double f = 3.141592653589793;
        //char g = 'A';
        //boolean h = true;
       // System.out.println("a = " + a);  //concatenation //output = a = 26
       // System.out.println("b = " + b);  //output = b = 8 
       // System.out.println("c = " + c);  //output = c = 16
       // System.out.println("d = " + d);  //output = d = 1234567890
       // System.out.println("e = " + e);  //output = e = 3.14
       // System.out.println("f = " + f);  //output = f = 3.141592653589793
       // System.out.println("g = " + g);  //output = g = A
       // System.out.println("h = " + h);  //output = h = true




        //sum of two numbers
        //int a = 10;
        //int b = 25;
        //int sum = a + b;
        //System.out.println("the sum of a and b is:" + sum); //output = the sum of a and b is:35

        //comments in java
        //this is a single line comment 
        /* this is a 
           multi line comment
           in java */

        
        

        //inputs in java
        //next
        //nextLine
        //nextInt  
        //nextFloat
        //nextDouble
        //nextBoolean
        //nextLong
        //nextByte
        //nextShort
        //nextChar
        //to use these we need to import the scanner class
        
        //Scanner sc = new Scanner(System.in);
        //System.out.println("enter your name:");
       // String name = sc.nextLine();
        //System.out.println("hello " + name); //output = hello (name entered by user)
        
       // int a = sc.nextInt();
       // System.out.println("the number you entered is: " + a); //output = the number you entered is: (number entered by user)   

       // float b = sc.nextFloat();
       // System.out.println("the float number you entered is: " + b); //output = the float number you entered is: (float number entered by user)

        //double c = sc.nextDouble();
       //System.out.println("the double number you entered is: " + c); //output = the double number you entered is: (double number entered by user)

       // boolean d = sc.nextBoolean();
       // System.out.println("the boolean value you entered is: " + d); //output = the boolean value you entered is: (boolean value entered by user)

        //long e = sc.nextLong();
       // System.out.println("the long number you entered is: " + e); //output = the long number you entered is: (long number entered by user)

       // byte f = sc.nextByte();
       // System.out.println("the byte number you entered is: " + f); //output = the byte number you entered is: (byte number entered by user)

       // short g = sc.nextShort();
       // System.out.println("the short number you entered is: " + g); //output = the short number you entered is: (short number entered by user)

       // char h = sc.next().charAt(0);
        //System.out.println("the char you entered is: " + h); //output = the char you entered is: (char entered by user)

       // sc.close(); //closing the scanner object to prevent memory leaks



       //sum of two numbers using user input
       // Scanner sc = new Scanner(System.in);
         // System.out.println("enter first number:");
         // int num1 = sc.nextInt();
         // System.out.println("enter second number:");
         // int num2 = sc.nextInt();
         // int sum = num1 + num2;
         // System.out.println("the sum of " + num1 + " and " + num2 + " is: " + sum); //output = the sum of (num1) and (num2) is: (sum of num1 and num2)
         // sc.close(); //closing the scanner object to prevent memory leaks


         //product of two numbers using user input
         // Scanner sc = new Scanner(System.in);
         // System.out.println("enter first number:");
         // int num1 = sc.nextInt();
         // System.out.println("enter second number:");
         // int num2 = sc.nextInt();
         // int product = num1 * num2;
         // System.out.println("the product of " + num1 + " and " + num2 + " is: " + product); //output = the product of (num1) and (num2) is: (product of num1 and num2)
         // sc.close(); //closing the scanner object to prevent memory leaks


         //area of circle using user input
         // Scanner sc = new Scanner(System.in);
         // System.out.println("enter the radius of the circle:");
         // double radius = sc.nextDouble();
         // double area = Math.PI * radius * radius;
         // System.out.println("the area of the circle with radius " + radius + " is: " + area); //output = the area of the circle with radius (radius) is: (area of the circle)
         // sc.close(); //closing the scanner object to prevent memory leaks



         //type conversion in java
         //type casting in java
         //type promotion in java
         //how is our code running?
         //assignment 1:-
         // VARIABLES & DATA TYPES QUESTIONS
/*Question 1 : In a program, input 3 numbers: A, B andC. Youhave to output the average of
these 3 numbers.
(Hint : Average of N numbers is sum of those numbers divided by N)

Question 2: In a program, input the side of a square. You have to output the area of the
square.
(Hint : area of a square is (side x side))


Question 3: Enter cost of 3 items from the user (using float data type)- a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)


Question 4: What will be the type of result in the following Java code?
(Hint : Look at the largest data type among these)
byte b = 4;
char c = 'a';
short s = 512;
int i = 1000;
float f = 3.14f;
double d = 99.9954;
result = (f*b) + (i%c) - (d*s)


Question 5: (Advanced) Will the following statement give any error in Java?
int $ = 24;


Note- These questions are only to help you practice the concepts of this chapter. These are
not designed to test your mathematical skills, just to understand logic building using Java




assignment answers:-



Solution 1:
import java.util .*;
//Average of 3 numbers
public class Solution {
public static void main(String args[]) {
Scanner sc = new Scanner (System.in) ;
int A = sc.nextInt();
int B = sc.nextInt();
int C = sc.nextInt();
int average = (A + B + C) / 3;
System.out.println("average is : " + average) ;




Solution 2:
import java.util .*;
// Area of a Square
public class Solution {
public static void main(String args[]) {
Scanner sc = new Scanner (System.in) ;
int side = sc.nextInt();
int area = side * side;
System.out.println("area of the square is : " + area) ;




Solution 3:
import java.util .*;
// Bill of Items
public class Solution {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
float pencil = sc.nextFloat ();
float pen = sc.nextFloat();
float eraser = sc.nextFloat ();
float total = pencil + pen + eraser;
System.out.println("Bill is :" + total) ;
//Add on - with 18% tax
float newTotal = total + (0.18f * total);
System.out.println("Bill with 18% tax : " + newTotal);




Solution 4:
In the mentioned code, the result variable will be of double type because oftype conversion.




Solution 5:
No, the statement will not give any error.
NamesofvariablesarecalledidentifiersinJava. Identifierrulesays, identifierscanstartwith
any alphabet or underscore (“_”) or dollar (“$”).
According to the rule the given variable name is a valid identifier



*/







   }
}  