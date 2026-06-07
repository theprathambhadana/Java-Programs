import java.util.Scanner;
public class simpleCALCULATOR {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number: ");
        int a = sc.nextInt();
        System.out.print("enter second number: ");
        int b =  sc.nextInt();
        System.out.println("for addition enter: 1 \n for subtraction enter: 2 \n for multiplication enter: 3 \n for division enter: 4 \n for remainder enter: 5");
        System.out.print("enter the operation number: ");
        int operator = sc.nextInt();    // we can also use--> { char operator = sc.next().chatAt(0); }  --> which means if we write case '+', then it will help to read that '+' in the operator we are going to enter.
        sc.close();

        switch(operator){
            case 1 : System.out.println("the addition of two numbers :" + (a+b)); break ;          // can also use case '+'

            case 2 : System.out.println("the subtraction of two numbers :" + (a-b)); break ;       // can also use case '-'

            case 3 : System.out.println("the multiplication of two numbers" + (a*b)); break ;      // can also use case '*'

            case 4 : System.out.println("the division of two numbers :" + (a/b)); break ;          // can also use case '/'

            case 5: System.out.println("the remainder of two numbers :" + (a%b)); break ;          // can also use case '%'

            default : System.out.println("Sorry our calculator is not that advance"); break ;

        }
    }
}



/* 

enter first number: 10
enter second number: 2
for addition enter: 1 
 for subtraction enter: 2 
 for multiplication enter: 3 
 for division enter: 4 
 for remainder enter: 5
enter the operation number: 
1
the addition of two numbers :12

*/