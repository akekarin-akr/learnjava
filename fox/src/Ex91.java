class Ex91 //หาค่ามากที่สุด
{
    public static void main(String[] data)
    {
        double m = 0;
        double[][] t = 
        {
            { 0, 0, 7.1, 0 },
            { 0, 0, 8.5, 0, 7.2 },
            { 9.2, 0, 0, 8.2, 0, 8.1, 7.3 }
        };
        for (int i = 0; i < t.length; i++)
        {
            for (int j = 0; j < t[i].length; j++)
            {
                if (m < t[i][j])
                {
                    m = t[i][j];
                }
            }
        }
        System.out.println(m);
    }
}

