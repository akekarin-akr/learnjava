import java.util.*;
class Ex1
{
    public static void main(String[] data)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Area: ");
        String result = "No";
        String[] all = { "Bang Yai", "Park Kred", "Nonthabury", "Patum Thani", "Rang Sit" };
        String area = in.nextLine();
            for (int i = 0; i < all.length; i++)
            {
                if (area.equals(all[i])) { result = "Yes"; }
            }
            System.out.println(result);
    }
}
