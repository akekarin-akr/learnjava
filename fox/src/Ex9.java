class Ex9 //ในกรณีที่แต่ละคอลัมน์ไม่เท่ากัน 
{
    public static void main(String[] data)
    {
        double[][] m = 
        {
            { 0, 0, 7.1, 0 },
            { 0, 0, 8.5, 0, 7.2 },
            { 0, 0, 8.2, 0, 8.1, 7.3 }
        };
        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; j < m[i].length; j++)
            {
                System.out.println(m[i][j]);
            }
        }
    }
}
