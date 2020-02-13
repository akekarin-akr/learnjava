//อะไรไม่รู้

class Ex6 {
    public static void main(String[] data) {
        int[] choice = { 1,4,5 };
        
        int[][] m = new int[choice.length][11];
        
        for (int j = 0;j < m[0].length; j++) { m[0][j] = 1; }
        for (int c = 1; c < choice.length; c++) {
            m[c][0] = 1;
            for (int j = 1; j < m[0].length; j++) {
                m[c][j] = m[c-1][j];
                int col = j - choice[c];
                if (col >= 0) {
                    m[c][j] = m[c][j] + m[c][col];
                }
            }
        }
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
