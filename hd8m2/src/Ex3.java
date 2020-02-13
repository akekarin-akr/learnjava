

class Ex3 {
    public static void main(String[] data) {
        int[] choice = { 1, 4, 5 };
        
        int[][] count = new int[choice.length][8];
        
        for (int j = 0; j < count[0].length; j++) {
                count[0][j] = 1;
            }
        
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i].length; j++) {
                System.out.print(count[i][j] + " ");
            }
            System.out.println();
        }
    }
}
