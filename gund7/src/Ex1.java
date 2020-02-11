class Ex1
{
    public static void main(String[] data)
    {
        g(0, "");
    }
    static int[] cards = { 7,5,3,8,1,2,3 };
    static int target = 23;
    static void g(int index, String s)
    {
        char[] a = s.toCharArray();
        int t = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] == 'Y') t = t + cards[i];
        }
        if (t == target) System.out.println(s);
        if (t >= target) return; //ถ้าค่ามันมากกว่าให้มันวิ่งกลับเลย(หยุด)
        if (index < cards.length)
        {
            g(index + 1, s + "Y");
            g(index + 1, s + "N");
        }

    }
}
