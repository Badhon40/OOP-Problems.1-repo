import java.util.Scanner;
public class pointDistance {
    static int i,j;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number of points:");
        int n=scanner.nextInt();
        System.out.print("Enter "+n+" points:");
        double[][]points=new double[n][2];
        for(i=0;i<n;i++)
        {
            
            
                points[i][0]=scanner.nextDouble();
                points[i][1]=scanner.nextDouble();
            
        }
        int p1=0,p2=1;
 double ShortDis=distance(points[p1][0],points[p1][1],points[p2][0],points[p2][1]) ;
 for(i=0;i<n;i++)
 {
     for(j=i+1;j<n;j++)
     {
         double distance1=distance(points[i][0],points[i][1],points[j][0],points[j][1]);
         if(ShortDis>distance1)
         {
             ShortDis=distance1;
         }
     }
    
 }
 for(i=0;i<n;i++)
 {
     for(j=0;j<n;j++)
     {
         if(distance(points[i][0],points[i][1],points[j][0],points[j][1])==ShortDis)
         {
             System.out.println("The closest points are (" +points[i][0]+","+points[i][1]+") and ("+points[j][0]+","+points[j][1]+")");
         }
     }
 }
        System.out.println("Distance is :"+ ShortDis);
    }
   public static double distance(double x1, double y1, double x2, double y2){
       return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
   }
}
  

