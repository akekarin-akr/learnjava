import java.util.*;
class Ex {
    public static void main(String[] data) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Numer: ");
        int n = in.nextInt();
        f(n, "");
    }
    
    static void f(int n, String s) {
        if (n == 0) {
            System.out.println(s);
        }
        else {
            f(n-1, s + "0");
            f(n-1, s + "1");
        }
    }
}