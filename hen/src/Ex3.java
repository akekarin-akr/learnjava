//อ่านข้อมูลจากไฟล์แล้วนำมาใส่ในตาราง ที่เป็น Matrix
import java.io.*;
import java.util.*;
class Ex3 {
    public  static void main(String[] data) throws Exception {
        
        
        File file = new File("city.txt");
        Scanner in = new Scanner(file);
        int v = in.nextInt();
        double[][] w = new double[v][v];
                
        while (in.hasNextInt()){
            int s = in.nextInt();
            int t = in.nextInt();
            double c = in.nextDouble();
            w[s][t] = c;
            w[t][s] = c;
        }
        
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.printf("%7.1f", w[i][j]);
            }
            System.out.println();
        }
    }
}
