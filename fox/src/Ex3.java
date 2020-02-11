class Ex3
{
    public static void main(String[] data)
    {
        go(0, "");
    }
    static int[] card = { 7, 3, 2, 5, 8, 9, 5 };
    
    static void go(int p, String s)
    {
        if (p == card.length)
        {
            char[] a = s.toCharArray();
            int t = 0;
            int i = 0;
            while (i < a.length)
            {
                if (a[i] == 'c')
                {
                    t = t + card[i];
                }
                i = i + 1;
            }
            System.out.println(s + " = " + t);
        }
        else
        {
            go(p+1, s + 's');
            go(p+1, s + 'c');
        }
    }
}
