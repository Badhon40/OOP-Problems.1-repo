import java.util.Scanner;

public class smallestNumber{
    public static int returnIdx( double[] arr){
        double smallest=arr[0];
        int index=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                index=i;
                smallest=arr[i];
            }
        }
        return index;
    }


public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size=sc.nextInt();
    double[] arr=new double[size];
    System.out.println("enter "+size+" Numbers");
    for(int i=0;i<size;i++){
        arr[i]=sc.nextDouble();
    }
    int index=returnIdx(arr);
    System.out.println("Smallest index is "+index);
}

}