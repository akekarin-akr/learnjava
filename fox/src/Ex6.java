class Ex6 //เป็นโจทย์ปัญหาเกี่ยวกับ มีรถบรรทุกเพื่อบรรทุกสินค้า และมีกล่องสินค้าอยู่ทั้งหมด 5 กล่อง 
        //โดยมีน้ำหนักและกำไรที่จะได้ดังต่อไปนี้ จากนั้นให้คำนวณวิธีที่สามารถขนของได้ 
        //รวมกำไรที่ได้และน้ำหนักที่ได้มาด้วย 

{
    public static void main(String[] data)
    {
        contain(0, "");
    }
    static double[] value = { 50, 30, 25, 10, 70 };
    static double[] weight = { 7, 6, 5, 3, 2 };
    
    static void contain(int p, String s)
    {
        if (p == value.length)
        {
            char[] a = s.toCharArray();
            double v = 0.0;
            double w = 0.0;
            int i = 0;
            while (i < a.length)
            {
                if (a[i] == 'Y')
                {
                    v = v + value[i];
                    w = w + weight[i];
                }
                i = i + 1;
            }
            System.out.println(s + " = " + v + "/" + w);
        }
        else
        {
            contain(p+1, s + 'Y');
            contain(p+1, s + 'N');
        }
    }
}
