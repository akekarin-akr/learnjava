

class Bfs4 {
    static class Data {
        String type;
        int width;
    }
    public static void main(String[] data) {
        int[] choice = { 1,4,5 };
        int total = 8;
        Data[] queue = new Data[10000];
        int fornt = 0, end = 0;
        Data first = new Data();
        first.type = "";
        first.width = 0;
        queue[end] = first;  //insert the first node
        end++;
        
        while (fornt < end) {
            Data current = queue[fornt++];
            for (int i = 0; i < choice.length; i++) {
                if (choice[i] + current.width <= total) {
                    Data child = new Data();
                    child.type = current.type + choice[i];
                    child.width = current.width + choice[i];
                    queue[end++] = child;
                }
            }
        }
        for (int i = 0; i < end; i++) {
            if (queue[i].width == total) {
                System.out.println(queue[i].type);
            }
        }
    }
}
