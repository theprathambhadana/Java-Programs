import java.util.Scanner;
public class factorialusingfunction {
    public static int factorial(int n){
        int result = 1;
       for(int i=1; i<=n;i++){
        result*=i;
       }
       return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("the factorial of two values is: " + factorial(n));

    }
}
