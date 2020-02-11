import java.util.*;
class E {
    public static void main(String[] data) {
        int[] area = { 10500, 10300, 10200, 13200, 65000, 67130 };
        Arrays.sort(area);
        func f = new func();
        boolean res = f.search(area, 0, area.length-1, 102500);
        System.out.println(res);
    }
    
}

class func {
    boolean search(int[] a, int left, int right, int code) {
        int mid = (left + right)/2;
        if(left > right) { return false; }
        if(code > a[mid]) { search(a, mid + 1, right, code); }
        if(code < a[mid]) { search(a, left, mid - 1, code); }
        return true;
    }
}