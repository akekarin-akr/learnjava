
import java.util.Arrays;

class T {
    public static void main(String[] data) {
        int[] ar = { 2,3,4,5,6,7,8 };
        
        boolean r = nor(ar, 9);
        System.out.println(r);
    }
    
    static boolean ser(int[] a, int l, int r, int code) {
        if(l > r) return false;
        int mid = (l+r)/2;
        if (code < a[mid]) { return ser(a, l, mid - 1, code); }
        if (code > a[mid]) { return ser(a, mid + 1, r, code); }
        return true;
    }
    
    static boolean nor(int[] a, int c) {
        Arrays.sort(a);
        int l = 0;
        int r = a.length - 1;
        boolean res = false;
        while (l <= r) {
            int mid = (l + r)/2;
            if (c == a[mid]) { res = true; break; }
            if (c > a[mid]) { l = mid + 1; }
            if (c < a[mid]) { r = mid - 1; }
        }
        return res;
    }
}