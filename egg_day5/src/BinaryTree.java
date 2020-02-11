class BinaryTree
{
    public static void main(String[] data)
    {
        Item root;
        root = new Item();
        root.key = 12;
        root.name = "Jame";
        
        root.left = new Item();
        root.left.key = 15;
        root.left.name = "Smit";
        
        root.right = new Item();
        root.right.key = 7;
        root.right.name = "David";
        
        root.left.left = new Item();
        root.left.left.key = 9;
        root.left.left.name = "Ben";
        
        root.right.left = new Item();
        root.right.left.key = 8;
        root.right.left.name = "Steve";
        
        System.out.println(sum(root));
        
        System.out.println(count(root));
        
        System.out.println(max(root));
        
        System.out.println(min(root));
        
        System.out.println(height2(root));
        
        System.out.println(height(root));
        
        System.out.println(leaf(root));
        
        System.out.println(minihegiht(root));
    }
    //1
    static int sum(Item r)
    {
        if (r == null) return 0;
        return sum(r.left) + sum(r.right) + r.key;
    }
    //2
    static int count(Item r)
    {
        if (r == null) return 0;
        return count(r.left) + count(r.right) + 1;
    }
    //3
    static int max(Item r)
    {
        if (r == null) return 0;
        int a = max(r.left);
        int b = max(r.right);
        int c = r.key;
        if (a > c) { c = a; }
        if (b > c) { c = b; }
        return c;
    }
    //4
    static int min(Item r)
    {
        if (r == null) return 9;
        int c = r.key;
        int a = min(r.left);
        int b = min(r.right);
        if (a < c) { c = a; }
        if (b < c) { c = b; }
        return c;
    }
    //5
    static int height2(Item r)
    {
        if (r == null) return 0;
        int a = height2(r.left);
        int b = height2(r.right);
        int h;
        if (a > b) return h = a + 1;
        return h = b + 1;
    }
    //5.2
    static int height(Item r)
    {
        if (r == null) return 0;
        int a = height(r.left);
        int b = height(r.right);
        if (a > b) return a + 1; 
        return b + 1;
    }
    //6
    static int leaf(Item r)
    {
        if (r == null) return 0;
        int a = leaf(r.left);
        int b = leaf(r.right);
        if (r.left == null && r.right == null) return 1;
        return a + b;
    }
    
    static int minihegiht(Item r) {
        if (r == null) return 0;
        int a = minihegiht(r.left);
        int b = minihegiht(r.right);
        if (r.left == null && r.right == null) return 1;
        if (a > b) return b + 1;
        else return a + 1;
    }
    
}

class Item
{
    int key;
    String name;
    Item left;
    Item right;
}