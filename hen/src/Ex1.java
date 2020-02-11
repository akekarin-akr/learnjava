import java.util.*;
class Ex1 {
    public static void main(String[] data){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = in.nextInt();
        int[][] a = new int[n][n];
        //fill upprt triangle
        for (int i = 0; i < a.length; i++){
            for (int j = i; j < a.length; j++){
                a[i][j] = 1;
            }
        }
        
        //make matrix
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
