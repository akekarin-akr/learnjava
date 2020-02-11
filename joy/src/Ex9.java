// เรื่อง Set
// TreeSet
import java.util.*;
class Ex9
{
    public static void main(String[] data)
    {
        TreeSet s = new TreeSet();
        s.add("L");
        s.add("M");
        s.add("E");
        s.add("E");
        s.add("M");
        
        boolean b = s.contains("M");
        System.out.println(b);
        
        boolean c = s.contains("C"); //คำสั่งใหม่
        System.out.println(c);
        
        System.out.println(s);
    }
}

