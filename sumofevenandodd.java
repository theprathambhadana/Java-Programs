import java.util.Scanner;
public class sumofevenandodd {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int choice;
        int evenSUM=0;
        int oddSUM=0;

        do{
            System.out.print("enter the numbers: ");
            int n = sc.nextInt();

            if( n%2 == 0){
                evenSUM+=n;
            }else{
                oddSUM+=n;
            }System.out.print("Do you want to continue? Press 1 for Yes or Press 0 for No : ");
            
            choice = sc.nextInt();
            
        }while(choice==1);
        System.out.println("Sum of even numbers: " + evenSUM);
        System.out.println("Sum of odd numbers: " + oddSUM);

    }
}
