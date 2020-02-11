import java.util.*;
class Ex2
{
    public static void main(String[] data)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter : ");
        while (in.hasNextDouble())
        {
            int num = in.nextInt();
            for (int i = 1; i <= num; i++)
            {
                if (num % i == 0) { System.out.print(i + " "); }
            }
            System.out.println();
        }
    }
}

