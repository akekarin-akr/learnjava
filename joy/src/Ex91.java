import java.util.*;

//Tree Map ถ้าใส่ข้อมูลซ้ำมาทีหลัง จะทับของเดิม

//Tree Set ถ้าใ่ส่ข้อมูลซ้ำมาทีหลัง จะข้ามไป
class Ex91
{
    public static void main(String[] data)
    {
        TreeMap<String, String>/*บังคับให้ Map String ไป String*/ m = new TreeMap();
        m.put("D", "10300");
        m.put("BP", "10700");
        m.put("BR", "10500");
        System.out.println(m);
        
        Object o = m.get("BP"); // ถ้าใส่ค่าที่ไม่มีจะออกมาเป็น null
        System.out.println(o);
        
        String s = "leetcode";
        char[] a = s.toCharArray();
        
    }
}
