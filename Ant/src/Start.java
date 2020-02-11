import java.util.*; // Utility
class Start 
{
    public static void main(String[] data) 
    {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter 3 sides : ");
       double a = in.nextDouble();
       double b = in.nextDouble();
       double c = in.nextDouble();
       String result = "Scalene";
       if (a == b) { result = "Iso1"; };
       if (b == c) { result = "Iso2"; };
       if (a == c) { result = "Iso3"; };
       if (a == b && b == c) { result = "Eq"; }
       System.out.println(result);
    }
}




