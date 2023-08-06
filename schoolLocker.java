import java.util.Scanner;

public class schoolLocker {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many students are in the Class?");
        int numOfStudent=sc.nextInt();
        boolean[] locker=new boolean[numOfStudent];
        for(int student=1;student<=numOfStudent;student++){
            for(int j=student-1;j<numOfStudent;j=j+student){
                locker[j]= !locker[j];
            }
        }
        System.out.println("After all the students Enter:");
        for(int i=0;i<=numOfStudent;i++){
            if(locker[i]==true){
                System.out.print((i+1)+" ");
            }
            
        }
    }
    
}
