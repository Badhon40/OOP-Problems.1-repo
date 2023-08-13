import java.util.Scanner;

public class diagonalSum {
    public static int getSumOfDiagonals(int[][] mat){
        int col=0;
        int sum=0;
        for(int row=0;row<mat.length && col<mat.length;row++,col++){
            sum +=mat[row][col];
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println("Enter the size of a matrix");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[][] mat= new int[size][size];

        System.out.println("Enter "+size*size+" elements:");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int sum=getSumOfDiagonals(mat);
        System.out.println("Sum of the major Diagonals is:"+sum);
    }
    
}
