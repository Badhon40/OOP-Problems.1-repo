import java.util.Scanner;

public class markov {
    static int n;
    public static void main(String[] args) {
        Scanner input  =new Scanner(System.in);
        System.out.println("Enter a number(n x n) for matrix:");
         n=input.nextInt();
        int i,j;
        double [][]a=new double[n][n];
        System.out.println("Enter Elements:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=input.nextDouble();
            }
        }
        boolean res=isMarkovMatrix(a);
        if(res)
        {
            System.out.println("This matrix is Markov Matrix");
        }
        else
            System.out.println("This matrix is not  Markov Matrix");    
    }
    public static boolean isMarkovMatrix(double[][] a) {
		return isElementsPositive(a) && check(a);
	}
    public static boolean isElementsPositive(double[][] a) {
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(a[i][j]<0)
                    return false;
            }
        }
        return true;
    }

    public static boolean check(double[][] a) {
        int r,c;
        double sum;
        for(c=0;c<n;c++)
        { sum=0;
            for(r=0;r<n;r++)
            { 
                
                    sum+=a[r][c];   
             
            }
            if(sum!=1)
                return false;
        }
        return true;
    }
}


