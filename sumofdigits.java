import java.util.Scanner;

public class sumofdigits {

    public static int addintegers(int n){
        int sum = 0;
        int lastdigit;
        while(n>0){
            lastdigit = n%10;
            sum+=lastdigit;
            n/=10;
        } return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int n = sc.nextInt();
        sc.close();
        System.out.print(addintegers(n));
    }
}
