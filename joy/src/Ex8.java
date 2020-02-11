import java.util.*;
class Ex8
{
    public static void main(String[] data)
    {
        LinkedList d = new LinkedList();
        d.add("Latte");
        d.add("Mocha");
        d.add("Espresso");
        
        System.out.println(d);
        Collections.sort(d);//ต้องเป็นข้อมูล ชนิดเดียวกัน (ถ้ามีข้อมูลผสมกัน)
        System.out.println(d);
    }
}
