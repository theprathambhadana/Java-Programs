import java.util.Scanner;
public class largestofthreenumbers {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first number:");
        int a = sc.nextInt();
        System.out.print("enter second number:");
        int b = sc.nextInt();
        System.out.print("enter third number:");
        int c = sc.nextInt();
        sc.close();

        if(a>b && a>c){
            System.out.println("the first number is the largest");
        }
        else if(b>a && b>c){
             System.out.println("the second number is the largest");
        }
        else{
             System.out.println("the third number is the largest");
        }
    }
}


/* 
enter first number:89
enter second number:23
enter third number:11
the first number is the largest
 */