import java.util.Scanner;
public class palindrome {
    public static void palindromeOrnot(int n) {
        int original = n;
        int revNum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            revNum = revNum * 10 + lastDigit;
            n = n / 10;
        }

        if (original == revNum) {
            System.out.println("It is a PALINDROME !!!");
        } else {
            System.out.println("It is not a PALINDROME :(");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        palindromeOrnot(num);
    }
}