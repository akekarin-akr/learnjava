//Depth first search //จำทางเลือก

class Depthf {
    public static void main(String[] data) {
        double[] size = { 1.2, 1.8, 2.5 };
        double[] price = { 170.0, 250.0, 300.0 };
        double rod = 7.0;
        double total = search(rod, size, price, "");
        System.out.println(total);
    }
    
    static double search(double current, double[] size, double[] price, String detail) {
        if (current == 0) { //no more branch available
            return 0;
        }
        else {
            int best = -1;
            double max = 0.0;
            for (int i = 0; i < size.length; i++) {
                if (current - size[i] >= 0) {
                    double result = search(current - size[i], size, price, detail + i);
                    if (max < result + price[i]) { 
                        max = result + price[i];
                        best = i;
                    }
                }
            }
            if (best == -1) {
                char[] a = detail.toCharArray();
                double t = 0.0;
                for (int i = 0.0; i < a.length ; i++) {
                    
                }
            }
        }
    }
}

