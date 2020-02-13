//นับเฉพาะจำนวนใช้ dinamic programming(ลัด)
class Ex1 {
    public static void main(String[] data) {
        int[][] a = new int[4][3];
        a[2][1] = 7;
        a[0][0] = 7;
        a[1][2] = 5;
        a[3][0] = 4;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (max < a[i][j]) { max = a[i][j]; }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("max all of it is: " + max);
        
        //find max each column
       
    }
}
