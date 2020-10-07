
import java.util.Scanner;

class Start {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int start;
        int end;
        int sum = 0;
        
        System.out.print("Enter the first number: ");
        start = scan.nextInt();
        System.out.print("Enter end of number: ");
        end = scan.nextInt();
        int number = start-1;
        
        for (int i = start; i <= end; i++) {
            number++;
            sum += number;
        }
        System.out.println("The sum of number is : " + sum);
    }
}
