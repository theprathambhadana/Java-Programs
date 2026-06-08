import java.util.Scanner;
public class Number1ton {
    public static void main(String args[]){

        int i=1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want to print:");
        int n = sc.nextInt();
        sc.close();

        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}
