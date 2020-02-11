//หาค่าที่น้อยที่สุดของ Ex3
import java.io.*;
import java.util.*;
class Start {
    public static void main(String[] data) throws Exception {
        File file = new File("city.txt");
        Scanner in = new Scanner(file);
        int v = in.nextInt();
        double infinity = Double.MAX_VALUE;
        
        double[][] w = new double[v][v];
        
        while (in.hasNextInt()) {
            int s = in.nextInt();
            int t = in.nextInt();
            double c = in.nextDouble();
            w[s][t] = c;
            w[t][s] = c;
        }
       
        
        
        
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                w[i][j] = infinity;
                System.out.printf("%7.1f", w[i][j]);
            }
            System.out.println();
        }
        double min = infinity;
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if (min > w[i][j]) min = w[i][j];
            }
        }
        System.out.println(min);
    }
}