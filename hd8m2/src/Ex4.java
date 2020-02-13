class Ex4 {
    public static void main(String[] data) {
        int[] choice = { 1, 4, 5 };
        
        int[][] count = new int[choice.length][8];
        
        
        for (int i = 0; i < count.length; i++) {
            count[i][0] = 1;
            for (int j = 1; j < count[i].length; j++) {
                int sum = 0;
                for (int c = 0; c < choice.length; c++) {
                    int col = j - choice[c];
                    if (col >= 0) {
                        sum += count[i][col];
                    }
                }
                count[i][j] = sum;
            }
        }
        
        
        
        
         for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i].length; j++) {
                System.out.print(count[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    
}
