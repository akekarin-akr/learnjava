class Start {
    public static void main(String[] data) {
        Shirt s;
        s = new Shirt();
        s.size = 'M';
        s.price = 180.0;
        
        Domino d;
        d = new Domino();
        d.left = 7;
        d.right = 3;
        d.show();
        d.rotate();
        d.show();
    }
}

class Shirt {
    char size;
    double price;
    double getSpecialprice(){
        return price * 0.90;
    }
    double Discoun() {
        if (size == 'S') { return price * 0.97; }
        if (size == 'M') { return price * 0.95; }
        if (size == 'L') { return price * 0.93; }
        return price * 0.90;
    }
    void show() {
        System.out.println(size);
    }
}

class Domino {
    int left;
    int right;
    void show(){
        System.out.println(left + ":" + right);
    }
    void rotate() {
        int a = left;
        int b = right;
        left = b;
        right = a;
    }
}