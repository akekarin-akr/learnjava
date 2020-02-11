//Breadth-Fist Search
class Node {
    double rod;
    double value;
    String datail = ""; //default value is null, not good, set to "";
}

class Bfs2 {
    public static void main(String[] data) {
        double[] size = { 1.2, 1.8, 2.5 };
        double[] price = { 170.0, 250.0, 300.0 };
        
        Node[] queue = new Node[10000];
        int front = 0;
        int last = 0;
        Node root = new Node();
        root.rod = 7.0;
        root.value = 0.0;
        root.datail = "";
//        queue[last] = root; //insert the root item to the queue
//        last++;
        queue[last++] = root;
        while (front < last) {
            Node current = queue[front];//get the first node from the gueue
            for (int i = 0; i < size.length; i++) {
                if (current.rod - size[i] >= 0) {
                    Node child = new Node();
                    child.rod = current.rod - size[i];
                    child.value = current.value + price[i];
                    child.datail = current.datail + i;
                    queue[last] = child;
                    last++;
                    //queue[last++] = child;
                }
            }
            front++;
        }
        for (int i = 0; i < last; i++) {
            System.out.println(queue[i].datail + " = " + queue[i].value);
        }
    }
}

