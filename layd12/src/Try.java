import java.util.*;
class Try
{
    public static void main(String[] data)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Area: ");
        String area = in.nextLine();
        String result = "No";
        
        String[] all = { "Bang Yai", "Park Kred", "Nonthabury", "Patum Thani", "Rang Sit" };
        
        for (int i = 0; i < all.length; i++)
        {
            if (area.equals(all[i])) { result = "Yes"; }
        }
        System.out.println(result);
    }
}
