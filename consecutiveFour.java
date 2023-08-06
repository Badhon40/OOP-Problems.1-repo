import java.util.Scanner;
public class consecutiveFour {
    public static boolean isConsecutiveFour(int[] arr){
        int count=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[i+1]){
                count++;
                 if(count==4)
            {
                return true;
            }
            
        }
        else{
            count=1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(isConsecutiveFour(arr));
        System.out.println();
    }
}
