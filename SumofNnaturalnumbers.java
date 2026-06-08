import java.util.Scanner;
public class SumofNnaturalnumbers {
    public static void main(String args[]){

        int i = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number till you want sum: ");
        int n = sc.nextInt();
        sc.close();

        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("the sum is " + sum);
    }
}    