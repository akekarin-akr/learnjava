import java.util.*;

//Tree Map ถ้าใส่ข้อมูลซ้ำมาทีหลัง จะทับของเดิม

//Tree Set ถ้าใ่ส่ข้อมูลซ้ำมาทีหลัง จะข้ามไป
class Ex92
{
    public static void main(String[] data)
    {
        String s = "leetcode";
        char[] a = s.toCharArray();
        
        TreeMap m = new TreeMap();
        for (int i = 0; i < a.length; i++)
        {
            Object o = m.get(a[i]);
            if (o == null)
            {
                m.put(a[i], 1);
            } 
            else 
            {
                int k = (Integer)o;
                k++;
                m.put(a[i], k);
            }
        }
        for (int i = 0; i < a.length; i++)
        {
            Object x = m.get(a[i]);
            int k = (Integer)x;
            if (k > 1) {System.out.println(a[i]);}
        }
        
    }
}
