import java.util.Scanner;
public class evennumberfunction {
    public static boolean isEVEN(int n){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if(num%2==0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String args[]){
        System.out.println("It is " + isEVEN(2));
    }
}

