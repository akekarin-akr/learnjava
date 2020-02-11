//Depth first search

class Depthf {
    public static void main(String[] data) {
        double[] size = { 1.2, 1.8, 2.5 };
        double[] price = { 170.0, 250.0, 300.0 };
        double rod = 7.0;
        double total = search(rod, size, price);
        System.out.println(total);
    }
    static double search(double current, double[] size, double[] price) {
        if (current == 0) { //no more branch available
            return 0;
        }
        else {
            double max = 0.0;
            for (int i = 0; i < size.length; i++) {
                if (current - size[i] >= 0) {
                    double result = search(current - size[i], size, price);
                    
                    if (max < result + price[i]) { max = result + price[i]; }
                }
            }
            return max;
        }
    }
}
