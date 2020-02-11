import java.io.*;
import java.util.*;

class Ex1 {
    public static void main(String[] data)  throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Integer: " );
        int a = in.nextInt();
        int i = 1;
        while (i <= a) {
            String r = String.valueOf(i);
            if (i % 3 == 0) { r = "Fizz"; }
            if (i % 5 == 0) { r = "Buzz"; }
            if (i % 3 == 0 && i % 5 == 0) { r = "FizzBuzz"; }
            System.out.println(r);
            i++;
        }
    }
}
