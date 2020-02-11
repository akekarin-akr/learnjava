class Ex8 //เป็นเกี่ยวกับ array 2 มิติ
{
    public static void main(String[] data)
    {
        double[][] m = new double[3][4];
        m[0][2] = 7.1; 
        //สร้างแบบนี้ก็ได้ 
        double[][] t = { {0,0,7.1,0}, {0,0,8.5,0}, {0,0,8.2,0} };
        //ให้หาผลรวมของคอลัมน์ที่ 3 
        double sum = 0.0;
        for (int i = 1; i < t.length; i++)
        {
            sum = sum + t[i][2];
        }
        System.out.println(sum);
    }
}
