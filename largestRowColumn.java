import java.util.Scanner;
public class largestRowColumn {
    

    static int n=4;
    public static void main(String[] args) {
        int [][] a=new int[n][n];
        int i,j,f=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=(int)(Math.random()*2);
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(" "+a[i][j]); 
            }
            System.out.println("");
        }
        int c = 0,c1 = 0;
        for(i=0;i<n;i++)
        { c=0;
        c1=0;
            for(j=0;j<n;j++)
            {
                if(a[i][j]==0){
                    c++;
                }
                else if(a[i][j]==1){
                    c1++;
                }
            }
            if(c==n){
                System.out.println("All 0s on row:"+i);
                f=1;
            }
            else if(c1==n)
            {
                System.out.println("All 1s on row:"+i);
                f=1;
            }
            
            
        }
        if(f!=1){
            System.out.println("No Same element on row");
        }
        
        
        checkCol(a);
        checkDigonal(a);
    }
    public static void checkCol(int[][]a) {
        
        int c = 0,c1 = 0,col,row,f=0;
        for(col=0;col<n;col++)
        { c=0;
        c1=0;
            for(row=0;row<n;row++)
            {
                if(a[row][col]==0){
                    c++;
                }
                else if(a[row][col]==1){
                    c1++;
                }
            }
            if(c==n){
                System.out.println("All 0s on Column:"+col);
                f=1;
            }
            else if(c1==n)
            {
                System.out.println("All 1s on Column:"+col);
                f=1;
            }
            
            
            
        }
        if(f!=1){
            System.out.println("No Same element on Column");
        }
       
        
        
    }
    public static void checkDigonal( int[][] a ) {
        int i,j,c=0,c1=0,f=1;
        for(i=0;i<n;i++){
           
            if(a[i][i]==0)
            {
                c++;
            }
            else if(a[i][i]==1){
                c1++;
            }
            else{
                f=0;
            }
            
        }
        if(c==n)
        {
            System.out.println("Digonal is full with 0s");
        }
        else if(c1==n){
            System.out.println("Digonal is full with 1s");
        }
        else
        {
            System.out.println("No same element in Digonal");
        }
        
    }
}


