
class Start {
    public static void main(String[] data) {
        Player root;
        root = new Player();
        root.number = 7;
        root.name = "David";
        
        root.left = new Player();
        root.left.number = 8;
        root.left.name = "James";
        
        root.right = new Player();
        root.right.number = 5;
        root.right.name = "Smith";
        
        root.left.left = new Player();
        root.left.left.number = 6;
        root.left.left.name = "John";

        root.right.left = new Player();
        root.right.left.number = 3;
        root.right.left.name = "Tony";
        
        root.right.right = new Player();
        root.right.right.number = 9;
        root.right.right.name = "Tim";
        System.out.println("count : " + count(root));
        
        System.out.println("leaf : " + leaf(root));
        
        System.out.println("height : " + height(root));
    }
    static int count(Player p) {
        if (p == null) { return 0; }
        return count(p.left) + count(p.right) + 1;
    }
    static int leaf(Player p) {
        if (p == null) { return 0; }
        int a = leaf(p.left);
        int b = leaf(p.right);
        if (p.left == null && p.right == null) {
            return 1;
        }
        return a + b;
    }
    static int height(Player p) {
        if (p == null){ return 0; }
        int a = height(p.left);
        int b = height(p.right);
        if (a > b) { return a + 1; }
        else return b + 1;
    }
}

class Player {

    int number;
    String name;
    Player left;
    Player right;
}

class Shirt {

    char size;
    double price;
}
