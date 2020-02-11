class Ex2
{
    public static void main(String[] data)
    {
        int[][] m = new int[10][cards.length];
        m[0][0] = 1;
        m[7][0] = 1;

        int c = 0;
        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[i].length; j++)
            {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[] cards = { 7,5,3,8,1,2,3 };
    static int target = 23;



}

