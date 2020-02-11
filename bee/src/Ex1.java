import java.util.*;
class Test
{
    public static void main(String[] data)
    {
        int[] card = { 7, 12, 15, 21, 13, 19, 23, 31 };
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int target = in.nextInt();
        
        System.out.println(scan(card, target));
    }
    
    static String scan(int[] c, int t)
    {
        Arrays.sort(c);
        int i = 0;
        int left = 0;
        int right = c.length - 1;
        String r = "No";
        while (left <= right)
        {
            if (c[left] + c[right] == t) 
            { 
                r = "Yes";
                break;
            }
            if (c[left] + c[right] > t)
            {
                right = right - 1;
            }
            if (c[left] + c[right] < t)
            {
                left = left + 1;
            }
        }
        return r;
    }
}


