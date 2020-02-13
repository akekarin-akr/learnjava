//โจทย์กระจก
class Ex7 {
    public static void main(String[] data) {
        int[] glass = { 1, 4, 5 };
        int[] price = { 48000, 72000, 8000 };
        
        f(8, glass, price, "");
    }
    static void f(int width, int[] glass, int[] price, String current) {
        if (width == 0) {
            char[] ar = current.toCharArray();
            double t = 0;
            for (int i = 0; i < ar.length; i++) {
                int w = ar[i] - '0';
                int index = -1;
                for (int j = 0; j < glass.length; j++) {
                    if (glass[j] == w) {
                        index = j;
                    }
                }
                if (index != -1) { t = t + price[index]; }
            }
            
            System.out.println(current + " = " + t);
            
        }
        else {
            for (int i = 0; i < glass.length; i++) {
             
                if (width >= 0) {
                    f(width - glass[i], glass, price, current + glass[i]);
                 
                }
            }
        }
    }
}
