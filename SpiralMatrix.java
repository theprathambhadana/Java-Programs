import java.util.Scanner;

public class SpiralMatrix {
    public static void Spiral(int matrix[][]){

        int Startrow=0;
        int Startcol=0;
        int Endrow= matrix.length-1;
        int Endcol= matrix[0].length-1;

        while( Startrow <= Endrow && Startcol <= Endcol ){
            //top row
            for(int j=Startcol; j<=Endcol; j++){
                System.out.print(matrix[Startrow][j] + " ");
            }

            //right column
            for(int j=Startrow+1; j<=Endrow; j++){
                System.out.print(matrix[j][Endcol] + " ");  
            }

            //bottom row
            for(int j=Endcol-1; j>=Startcol; j--){
                if(Startcol == Endcol){
                    break;
                }
                System.out.print(matrix[Endrow][j] + " ");
            }

            //left column
            for(int j=Endrow-1; j>=Startrow+1; j--){
                if(Startrow == Endrow){
                    break;
                }
                System.out.print(matrix[j][Startcol] + " ");
            }

            Startrow++;
            Startcol++;
            Endcol--;
            Endrow--;
        }
        System.out.println();
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
        Spiral(matrix);
    }
}