import java.util.*;
class Start {
    public static void main(String[] data) {
        int[] area = { 10500, 10300, 10200, 13200, 65000, 67130 };
        Arrays.sort(area);
        Engine e = new Engine();
        boolean res = e.search(area, 0, area.length-1, 10200);
        System.out.println(res);
    }
    
    static double f(int n) {
        if ( n == 0 ) return 1;
        else return 2*f(n-1);
    }
    
    static int point(String s) {
        char[] c = s.toCharArray();
        int i = 0;
        int p = 0;
        while(i < c.length) {
            if(c[i] == 'W') { p+=3; }
            if(c[i] == 'L') { p+=1; }
            i++;
        }
        return p;
    }
}



//Enumeration
enum Weekend { Saturday, Sunday }


interface I {  }
class Tool {
    double area(double w, double h) {
        return w * h;
    }
    static double test(double w, double h) {
        return w * h;
    }
}



class Engine {
    boolean search(int[] sorted, int left, int right, int code) {
        int mid = (left + right) /2;
        if (left > right) { return false; }
        if (code > sorted[mid]) return search(sorted, left, mid-1, code);
        if (code < sorted[mid]) return search(sorted, mid-1, right, code);
        return true;
    }
}