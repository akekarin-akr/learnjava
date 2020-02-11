class Test
{
    public static void main(String[] data)
    {
        glass(0, "");
    }
    
    static void glass(int w, String s)
    {
        char[] a = s.toCharArray();
        int p = 0;
        if (w == 10)
        {
            for (int i = 0; i < a.length; i++)
            {
                if (a[i] == '5') p = p + 1000;
                if (a[i] == '4') p = p + 800;
                if (a[i] == '1') p = p + 500;
            }
            System.out.println(p);
        }
        else
        {
            if (w + 5 <= 10) { glass(w+5, s + '5'); }
            if (w + 4 <= 10) { glass(w+4, s + '4'); }
            if (w + 1 <= 10) { glass(w+1, s + '1'); }
        }
    }
}
