import java.util.Scanner;
public class passorfail {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("enter your marks percentage:");
        int percentage = sc.nextInt();
        sc.close();

        String a = (percentage>=33)? "pass":"fail";
        System.out.println("you are " + a);
    }
}

/*
enter your marks percentage:23
you are fail

enter your marks percentage:33
you are pass


enter your marks percentage:67
you are pass
*/