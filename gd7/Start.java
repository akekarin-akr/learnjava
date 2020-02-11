//greedy ใช้ได้กับ double ด้วย

class Start {
    public static void main(String[] data) {
        double[] size = { 1.2, 1.8, 2.5 };
        double[] price = { 170.0, 250.0, 300.0 };
        double rod = 7.0;
        double total = 0.0;
        while (true) {
            int best = -1;
            for (int i = 0; i < size.length; i++) {
                if (rod >= size[i]) {
                    if (best == -1 || price[i] > price[best]) { 
                        best = i; 
                    }
                }
            }
            if (best != -1) {
                total += price[best];
                rod = rod - size[best];
            }
            if (best == -1) break;
        }
        System.out.println(total);
    }
    
}
// A = 1.2
// B = 1.8
// C = 2.5
