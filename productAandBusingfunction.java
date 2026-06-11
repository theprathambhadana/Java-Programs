import java.util.Scanner;
public class productAandBusingfunction {
    public static int productAandB(int a , int b){
        int product = a*b;
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("enter second number : ");
        int num2 =sc.nextInt();
        sc.close();
        System.out.println("the product of the two values is: " + productAandB(num1,num2));
    }
}
