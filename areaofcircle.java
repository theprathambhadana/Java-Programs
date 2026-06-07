import java.util.Scanner;
public class areaofcircle {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        sc.close();
        
        float area = 3.14159265f*r*r;    //double area = 3.14159265*r*r;   // that small "f" used for declaring that the number 3.14159265 is float, if we didn't wrote flaot their it would be consider as double .

        System.out.println("the area of circle is : " + area);

    }
    
}
