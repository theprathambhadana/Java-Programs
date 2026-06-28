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




        public static int count(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int count = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 7){
                    count+=1;
                }
            }
        }System.out.println(count);
        return count;
        
    }

    public static int[][] transpose(int[][] matrix) {
    int n = matrix.length;
    int m = matrix[0].length;

    int[][] transposed = new int[m][n];  // dimensions flipped

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            transposed[j][i] = matrix[i][j];  // assignment direction correct
        }
    }
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print("[" + transposed[i][j] + "]");  // assignment direction correct
        }System.out.println();
    }
    return transposed;
}



    public static int Sum(int[][] matrix){
        int sum = 0, n = matrix.length, m = matrix[1].length;
        for(int i=1; i<n-1; i++){
            for(int j=0; j<m; j++){
                sum+=matrix[i][j];
            }
        }
        System.out.println(sum);
        return sum;
    }


    public static void main(String args[]){


        int matrix[][] = { {0,0,0},{3,3,3},{2,2,2},{1,1,1}};
        transpose(matrix);
        //int matrix [][]= new int[3][3];
        //int n = matrix.length;
        //int m = matrix[0].length;

        //Scanner sc = new Scanner(System.in);
        //for(int i=0; i<n; i++){
        //    for(int j=0; j<m; j++){
        //        matrix[i][j]= sc.nextInt();
        //    }
        //}

        //sc.close();

        //output:- 
        //for(int i=0; i<n; i++){
        //    for(int j=0; j<m; j++){
        //        System.out.print(matrix[i][j] + " ");
        //    }
        //    System.out.println();
        //} 
        //search(matrix, 1);
    }

}
