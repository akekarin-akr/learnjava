
import java.util.*;

class E {
    public static void main(String[] data) {
        int[] a = { 7,5,3,2,3,4,8,2,1,6,9 };
        Arrays.sort(a);
        int i = 1;
        int c = 1;
        while (i < a.length) {
            if(a[i] != a[i-1]) { c++; }
            i++;
        }
        System.out.println(c);
    }
}
