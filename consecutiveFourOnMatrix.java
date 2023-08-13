import java.util.Scanner;
public class consecutiveFourOnMatrix {
   static int row,col,i,j,k,m;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row and column:");
        row=sc.nextInt();
        col=sc.nextInt();
       
        int a[][]=new int[row][col];
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        if(check(a))
        {
            System.out.println("Consecutive numbers found!");
        }
        else
        {
            System.out.println("Not found!");
        }
        
    }
    public static boolean check(int[][] a) {
        //row check;
        for(i=0;i<row;i++)
        {
            for(j=0;j<=col-4;j++)
            {
                if((a[i][j]==a[i][j+1]) && (a[i][j+1]==a[i][j+2])&&(a[i][j+2]==a[i][j+3]))
                {
                    return true;
                }
            }
        }
        //col check
        for(j=0;j<col;j++)
        {
            for(i=0;i<=row-4;i++)
            {
                if((a[i][j]==a[i+1][j]) && (a[i+1][j]==a[i+2][j])&&(a[i+2][j]==a[i+3][j]))
                {
                    return true;
                }
            }
        }
        //lower right
        for(i=0;i<=row-4;i++)
        {
            for(j=0;j<=col-4;j++)
            {
                if((a[i][j]==a[i+1][j+1]) &&(a[i+1][j+1]==a[i+2][j+2]) && (a[i+2][j+2]==a[i+3][j+3]))
                    return true;
            }
        }
        //upper right
        for(i=3;i<row;i++)
        {
            for(j=0;j<=col-4;j++)
            {
                if((a[i][j]==a[i-1][j+1]) &&(a[i-1][j+1]==a[i-2][j+2]) && (a[i-2][j+2]==a[i-3][j+3]))
                    return true;
            }
        }
        return false;
    }
    
}

 

