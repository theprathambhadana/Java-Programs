import java.util.Scanner;
public class largestoftwonumbers{
    public static void main(String args[]){
         
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first numbers :");
        int a = sc.nextInt();
        System.out.print("enter the second number :");
        int b = sc.nextInt();
        sc.close();

        if(a>b){
            System.out.println("the first number " + a + " is greater than the second number " + b );
        }
        if(a<b){
            System.out.println("the second number " + b + " is greater than the first number " + a );
        }
    }
}

//PS C:\Java Programs> javac largestoftwonumbers.java
//PS C:\Java Programs> java largestoftwonumbers

//enter the first numbers :10
//enter the second number :5
//the first number 10 is greater than the second number 5


///PS C:\Java Programs> java largestoftwonumbers
//enter the first numbers :5 
//enter the second number :10
//the second number 10 is greater than the first number 5

