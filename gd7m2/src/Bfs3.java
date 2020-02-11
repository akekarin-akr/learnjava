import java.util.*;

class Bfs3 {
    static class Item {
        String detail;
        int width;
    }
    public static void main(String[] data) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter width: ");
        int n = in.nextInt();
        Item[] queue = new Item[10000];
        int front = 0, rear = 0;
        Item first = new Item();
        first.detail = "";
        first.width = 0;
        queue[rear] = first;  //insert the first node
        rear++;
        while (true) {
            Item current = queue[front++];
            if (current.width < n) {
                Item child = new Item();
                child.detail = current.detail + 0;
                child.width = current.width + 1;
                queue[rear++] = child; //insert to the queue
                
                Item child2 = new Item();
                child2.detail = current.detail + 1;
                child2.width = current.width + 1;
                queue[rear++] = child2;
            }
            if(front >= rear) break;
        }
        for (int i = 0; i < rear; i++) {
            System.out.println(queue[i].detail);
        }
    }
}
