import java.util.Scanner;
//import java.math.*;;
public class RandomNumberGuessingGame{
    public static void main(String args[]){
        int attempts = 0;
        int RandomNumber = 25;
        boolean NumberGuessing = true;
        while(NumberGuessing){
            attempts++;

            }while(!NumberGuessing){

                Scanner sc = new Scanner(System.in);
                System.out.println("Guess: ");
                int guess = sc.nextInt();

                if(guess > RandomNumber){
                System.out.println("Oops , Too Low");
                System.out.println("Try Again");
            } else if(guess < RandomNumber){
                System.out.println("Aghhh, Too High");
                System.out.println("Try Again");
            } else {
                System.out.println("CORRECT !!!!!");
            }System.out.println(attempts);
            sc.close();

        }

    }
}
