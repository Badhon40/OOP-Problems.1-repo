import java.util.Scanner;

public class indenticalMatrix {
    static int n=3,i,j;
    public static void main(String[] args) {
        int a[][]=new int[n][n];
        int b[][]=new int[n][n];
        Scanner input=new Scanner (System.in);
        System.out.println("Enter Elements for(3 x 3) matrix1:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=input.nextInt();
            }
        }
        System.out.println("Enter Elements for(3 x 3) matrix2:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                b[i][j]=input.nextInt();
            }
        }
        boolean res=check(a,b);
        if(res)
        {
            System.out.println("Both Matrix are Identical");
        }
        else
            System.out.println("Matrix are not Identical");
        
    }
    public static boolean check(int [][]a,int [][]b) {
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(a[i][j]!=b[i][j])
                    return false;
            }
        }
        return true;
    }
    
}

