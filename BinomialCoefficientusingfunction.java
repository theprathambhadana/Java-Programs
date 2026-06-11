import java.util.Scanner;
public class BinomialCoefficientusingfunction{
    public static int factorial(int n){
        int result = 1;
       for(int i=1; i<=n;i++){
        result*=i;
       }
       return result;
    }    
    public static int BinomialCoefficient(int n , int r){
        int N = factorial(n);
        int R = factorial(r);
        int M = factorial(n-r);
        int binCoeff = N/(R*M);
        return binCoeff;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();
        System.out.println("enter r: ");
        int r = sc.nextInt();
        sc.close();
        System.out.println("the binomialcoefficient of these values is: " + BinomialCoefficient(n, r));
        
    }
}
