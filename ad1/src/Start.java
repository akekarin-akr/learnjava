class Start {
    public static void main (String[] data) {
        int i = 1;
        int ball = 7;
        int level = 1;
        int c = 0;
        while (c < ball) {
            while(i <= level) {
                System.out.print("O");
                i++;
                c++;
                if (c == ball) break;
            }
            System.out.println();
            level++;
            i = 1;
        }
    }
}


class Student {
    String name;
    double score;
}

class Diamond {
    double weight;
    char grade;
}