//หาค่าที่มากที่สุด ของ Ex3
import java.io.*;
import java.util.*;
class Ex4 {
    public static void main(String[] data) throws Exception {
        File file = new File("city.txt");
        Scanner in = new Scanner(file);
        int v = in.nextInt();
        
        double[][] w = new double[v][v];
        while (in.hasNextInt()) {
            int s = in.nextInt();
            int t = in.nextInt();
            double c = in.nextDouble();
            w[s][t] = c;
            w[t][s] = c;
        }
        
        double max = 0;
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if (max < w[i][j]) max = w[i][j];
            }
        }
        
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.printf("%7.1f", w[i][j]);
            }
            System.out.println();
        }
        System.out.println("Max is : " + max);
        
    }
}
