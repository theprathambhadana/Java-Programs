import java.util.Scanner;
public class taxcalculator {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income(in numbers with no symbols):");
        int income = sc.nextInt();
        sc.close();

        if(income<500000){
            System.out.println("NO TAX APPLIED");
        }
        else if(income>500000 && income<1000000){
            System.out.println("20% TAX WILL BE APPLIED");
            double tax20APPLIED = 0.2*income;        // we can also take write:- int tax20APPLIED = (int)(0.2*income);
            income-=tax20APPLIED;
            System.out.println("Your Salary after TAX DETECTION will be" + income);
        }
        else{
            System.out.println("30% TAX APPLIED");
            double tax30APPLIED = 0.3*income;        // we can also take write:- int tax30APPLIED = (int)(0.3*income);
            income-=tax30APPLIED;
            System.out.println("Your Salary after TAX DETECTION will be" + income);
        }
    }
}

//Enter your income(in numbers with no symbols):400000 
//NO TAX APPLIED


//Enter your income(in numbers with no symbols):800000
//20% TAX WILL BE APPLIED
//Your Salary after TAX DETECTION will be640000


//Enter your income(in numbers with no symbols):1000001
//30% TAX APPLIED
//Your Salary after TAX DETECTION will be700000