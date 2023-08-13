import java.util.Scanner;

public class evenOneInMatrix {
    public static boolean isAllRowsEven1s(int[][] mat){
        int totalEven_1ExistedRow = 0;
        for(int i=0; i<mat.length; i++){
            int countrows1 = 0;
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] == 1){
                countrows1++;
                }
            }
        if(countrows1 %2 != 0 ){
            return false; 
        }else{
            totalEven_1ExistedRow++;
            }
        }
            if(totalEven_1ExistedRow == mat.length){
                return true;
            }else{
            return false;
            }
        }
        public static boolean isAllColumEven1(int[][] mat){
            int totalEven_1ExistedCol = 0;
            for(int i=0; i<mat.length; i++){
            int countCols1 = 0;
            for(int j=0; j<mat[0].length; j++){
            if(mat[j][i] == 1){
            countCols1++;
            }
            }
            if(countCols1 %2 != 0 ){
            return false; 
            }else{
            totalEven_1ExistedCol++;
            }
            }
            if(totalEven_1ExistedCol == mat.length){
            return true;
            }else{
            return false;
            }
            }
            
        public static void main(String[] args){
        int[][] mat = new int[6][6];
        Scanner sc = new Scanner(System.in);
        System.out.println("The matrix after auto generated: ");
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                mat[i][j] = sc.nextInt();
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        if(isAllRowsEven1s(mat)&& isAllColumEven1(mat)){
        System.out.println("Yes");
        }else{
        System.out.println("No");
        }
    } 
}
