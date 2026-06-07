import java.util.Scanner;
public class oddoreven {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int a = sc.nextInt();
        sc.close();

        if(a%2==0){
            System.out.println("it is even");
        
        }
        else{
            System.out.println("It is odd");
        }
    }
}

//enter number:29999999
//It is odd
  
//enter number:2345434
//it is even
