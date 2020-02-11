class Test {
    public static void main(String[] data) {
        String s = "LVIII";
        char[] ch = s.toCharArray();
        int[] keep = new int[ch.length];
        int c = 0;
        int r = 0;
        for (char i : ch) {
            if (i == 'I') { r = 1; keep[c] = r; c++;}
            if (i == 'V') { r = 5; keep[c] = r; c++; }
            if (i == 'X') { r = 10; keep[c] = r; c++; }
            if (i == 'L') { r = 50; keep[c] = r; c++; }
            if (i == 'C') { r = 100; keep[c] = r; c++; }
            if (i == 'D') { r = 500; keep[c] = r; c++; }
            if (i == 'M') { r = 1000; keep[c] = r; c++; }
        }
        int maxpo = 0;
        for (int i = 0; i < keep.length; i++) {
            if (maxpo < keep[i]) {
                maxpo = 
            }
        }
    }
}
