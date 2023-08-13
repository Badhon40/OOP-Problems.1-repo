import java.util.Scanner;
public class latinLetter{ 
    static int i,n,j;
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         boolean res = false;
         System.out.println("Enter a number:");
         n=in.nextInt();
         char [][]a=new char[n][n];
         System.out.println("Enter Characters:");
         for(i=0;i<n;i++)
         {
             for(j=0;j<n;j++)
             {
                 a[i][j]=in.next().charAt(0);
             }
                res=check(a,i);
                if(res==false)
                {
                    System.out.println("Invalid input");
                    break;
                }
             
         }
            if(res)
            {
                if(Rowcheck(a)&& colcheck(a))
                {
                    System.out.println("Latin Square!");
                }
                else
                    System.out.println("Not Latin Square!");
            }
           
        
         
    }
    public static boolean check(char[][] a,int r) {
        
        
            for(j=0;j<n;j++)
            {
                char c=a[r][j];
                int dex=c-'A';
                if(dex<0 || dex>=n)
                {
                    return false;
                }
            }
        
        return true;
    }
    public static boolean Rowcheck(char[][] a) {
        for(i=0;i<n;i++)
        {
            int count[]=new int[n];
            for(j=0;j<n;j++)
            {
                char c=a[i][j];
                int dex=c-'A';
                if(dex<0 || dex>=n ||count[dex]>0)
                {
                    return false;
                }
                count[dex]++;
            }
            
        }
        return true;
    }
    public static boolean colcheck(char[][] a) {
         for(i=0;i<n;i++)
        {
            int count[]=new int[n];
            for(j=0;j<n;j++)
            {
                char c=a[j][i];
                int dex=c-'A';
                if(dex<0 || dex>=n||count[dex]>0)
                {
                    return false;
                }
                count[dex]++;
            }
            
        }
        return true;
    }
}


