class Ex1
{
    public static void main(String[] data)
    {
        show(3, "");
    }
    
    static void show(int n, String s)
    {
        if (n == 0) System.out.println(s);
        else
        {
            show(n-1, s + '0');
            show(n-1, s + '1');
        }
    }
}
