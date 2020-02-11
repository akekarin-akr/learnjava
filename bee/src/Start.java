import java.util.*;
class Start 
{
    public static void main(String[] data)
    {  
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your area : ");
        int a = in.nextInt();
        int [] area = {10500, 10300, 10700, 10400, 11000, 12000, 20000};
        Arrays.sort(area);
        int l = 0;
        int r = area.length - 1;
        String result = "No";
        while (l <= r)
        {
            int mid = (l + r)/2;
            if (a == area[mid])
            {
                result = "Yes";
                break;
            }
            if (a > area[mid])
            {
                l = mid + 1;
            }
            if (a < area[mid])
            {
                r = mid - 1;
            }
        }
        System.out.println(result);
    }
}



