class Ex2
{
    public static void main(String[] data)
    {
        walk(3, 2, "");
    }
    static void walk(int m, int n, String s)
    {
        if (m == 0 && n == 0) System.out.println(s);
        else
        {
            if (m > 0) walk(m-1, n, s + 'R');
            if (n > 0) walk(m, n-1, s + 'D');
        }
    }
}
