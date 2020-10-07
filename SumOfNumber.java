
import java.util.Scanner;

class SumOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int start;
        int end;
        
        System.out.print("Enter fist number: ");
        start = scan.nextInt();
        System.out.print("Enter end number: ");
        end = scan.nextInt();
        int k = start-1;
        for (int i = start; i <= end; i++) {
            k = k + 1;
            sum = sum + k;
        }
        System.out.println("sum of number is: " + sum);
    }
}