import java.util.Scanner;
public class fibonnaciseries {
    public static void main(String args[]){
        
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int num = sc.nextInt();
        sc.close();

        for(int i = 1; i<=num; i++){
            fact = fact*i;
        }System.out.println("the factorial of " + num + " is " + fact);                      // n!= n * (n-1)(n-2)(n-3)..............and so on.
    }
}
