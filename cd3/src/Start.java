import java.util.*;
class Start {
    public static void main(String[] data) {
        double[] people = { 60.0, 42.0, 35.0, 75.0, 25.0, 40.0 };
        double target = 80.0;
        Arrays.sort(people);
        int boat = 0;
        int l = 0;
        int r = people.length - 1;
        int i = 0;
        while (l <= r) {
            if(people[l] + people[r] > target) {
                boat++; r--;
            }
            if(people[l] + people[r] <= target) {
                boat++; l++; r--;
            }
        }
        System.out.println("boat = " + boat);
    }
}

