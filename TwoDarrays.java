import java.util.Scanner;
public class TwoDarrays {

    public static boolean search(int[][] matrix, int key){
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == key){
                    System.out.print("found at key " + "("+ i + "," + j + ")" );
                    return true;
                }
            }
        }
        System.out.print(" key not found ");
        return false;
    }
    public static void main(String args[]){
        
        int matrix [][]= new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j]= sc.nextInt();
            }
        }

        sc.close();

        //output:- 
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        } 
        search(matrix, 1);
    }

}
