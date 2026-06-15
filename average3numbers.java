import java.util.Scanner;
public class average3numbers{
    public static double average(int a,int b,int c){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        sc.close();
        double avg = (num1 + num2 + num3)/3;
        return avg;
    }
    public static void main(String args[]){
        System.out.println("The average sum of these numbers is: " + average(3,4,5));
    }
}


