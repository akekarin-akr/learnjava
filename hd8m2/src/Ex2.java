class Ex2 {
    public static void main(String[] data) {
        int[][] a = new int[10][10];
         int f = 0;
        int e = a.length - 1;
        for (int i = 0; i < a.length; i++) {
           a[i][i] = 1;
            a[f][e] = 1;
            f++;
            e--;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
