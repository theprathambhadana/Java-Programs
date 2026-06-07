import java.util.Scanner;
public class sum_of_AandB{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number 1:");
        int a = sc.nextInt();
        System.out.print("enter number 2:");
        int b = sc.nextInt();
        sc.close();

        int sum = a+b;
        System.out.println("the sum of " + a + " and " + b + " is " + sum);


    }

}

