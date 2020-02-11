import java.util.*;
class Ex7
{
    public static void main(String[] data)
    {
        ArrayList<String> b = new ArrayList(); //บังคับให้ใส่ String
        b.add("L");
        b.add("M");
        b.add("E");
        b.add("L");
        b.add("C");
        
        System.out.println(b);
        //การลบ มี 2 แบบ คือ ลบ index กับ ลบ ตัวข้อมูลเลย
        b.remove(1);
        System.out.println(b);
        
        b.remove("L");
        System.out.println(b);
        
    }
}
//สรุปคำสั่ง ArrayList
//add(x)
//size()
//get(i)
//remove(i)
//remove("k")
//Collections
