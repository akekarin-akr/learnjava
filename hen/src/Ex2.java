class Ex2 {
    public static void main(String[] data) {
        double[][] a = new double[5][5];
        
        for (int v = 0; v < a.length; v++){
            for (int i = 0; i + v < a.length; i++) {
                int j = i + v;
                a[i][j] = 1;
            }
        }
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.printf("%5.1f", a[i][j]);
            }
            System.out.println();
        }
    }
}
// upper อีกวิธีนึง