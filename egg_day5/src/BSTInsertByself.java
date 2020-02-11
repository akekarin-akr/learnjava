class BSTInsertByself
{
    public static void main(String[] data)
    {
        Item root = null;
        root = insert(root, 7);
        root = insert(root, 5);
        root = insert(root, 3);
        root = insert(root, 2);
        root = insert(root, 1);
        root = insert(root, 8);
        root = insert(root, 6);
        
        show(root);
    }
    
    static Item insert(Item r, int k)
    {
        if (r == null) 
        {
            r = new Item();
            r.key = k;
            return r;
        }
        if (k < r.key) { r.left  = insert(r.left, k); }
        if (k > r.key) { r.right = insert(r.right, k); }
        return r;
    }
    
    static void show(Item r)
    {
        if (r == null) return; // ย้อนกลับ
        show(r.left);
        System.out.println(r.key);
        show(r.right);
    }
}

class Item
{
    int key;
    String name;
    Item left;
    Item right;
}