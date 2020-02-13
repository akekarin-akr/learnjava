class Start {
    public static void main(String[] data) {
        int[] choice = { 1, 4, 5 };
        f(6, choice, "");
    }
    static void f(int width, int[] choice, String current) {
        if (width == 0) {
            System.out.println(current);
        }
        else {
            for (int i = 0; i < choice.length; i++) {
                if (width >= 0) {
                    f(width - choice[i], choice, current + choice[i]);
                }
            }
        }
    }
}