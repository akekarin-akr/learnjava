class E {
    public static void main(String[] data) {
        Node root = null;
        root = insert(root, 5);
        root = insert(root, 7);
        root = insert(root, 2);
        root = insert(root, 9);
        root = insert(root, 1);
        root = insert(root, 8);
        root = insert(root, 3);
        root = insert(root, 7);
        
        
        
        
        int h = height(root);
        int[] sum = new int[h];
        sumByLe(root, 0, sum);
        int i = 0;
        while (i < sum.length) {
            System.out.println(sum[i]);
            i++;
        }
        
        print(root);
        
    }
    static Node insert(Node r, int k) {
        if (r == null) {
            r = new Node();
            r.key = k;
            return r;
        }
        if (k < r.key) { r.left = insert(r.left, k); }
        if (k > r.key) { r.right = insert(r.right, k); }
        return r;
    }
    
    static void print(Node r) {
        if (r == null) {
            return;
        }
        print(r.left);
        System.out.print(r.key);
        print(r.right);
    }
    
    static void sumByLe(Node r, int level, int[] sum) {
        sum[level] = sum[level] + r.key;
        if (r.left != null) { sumByLe(r.left, level + 1, sum); }
        if (r.right != null) { sumByLe(r.right, level + 1, sum); }
    }
    
    static int height(Node p) {
        if (p == null){ return 0; }
        int a = height(p.left);
        int b = height(p.right);
        if (a > b) { return a + 1; }
        else return b + 1;
    }
 }

class Node {
    int key;
    Node left;
    Node right;
    
}