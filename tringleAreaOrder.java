import java.text.DecimalFormat;
import java.util.Scanner;

public class tringleAreaOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();

        double area1 = calculateTriangleArea(x1, y1, x2, y2, x3, y3);
        double area2 = calculateTriangleArea(x1, y1, x3, y3, x4, y4);
        double area3 = calculateTriangleArea(x1, y1, x4, y4, x2, y2);
        double area4 = calculateTriangleArea(x2, y2, x3, y3, x4, y4);

        double[] areas = { area1, area2, area3, area4 };
        double temp;
        for(int i=0;i<4-1;i++)
        {
            for(int j=i+1;j<4;j++)
            {
                if(areas[i]>areas[j]){
                    temp=areas[i];
                    areas[i]=areas[j];
                    areas[j]=temp;
                }
            }
        }
        
        System.out.print("The Areas:");
        DecimalFormat df=new DecimalFormat("#.##");
        for(double d: areas)
        {
            System.out.print(df.format(d));
            System.out.print(" ");
        }
        System.out.println("");
      
       
    }
    public static double calculateTriangleArea(double x1,double y1,double x2,double y2,double x3 ,double y3) {
        double a,b,c,s;
        a=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        b=Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
        c=Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
        s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));//Math.sqrt(s*(s-a)*(s-b)*(s-c));
                
        
        
    }
}
