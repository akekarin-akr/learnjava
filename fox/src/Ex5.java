import java.util.*;
class Ex5 //เป็นโจทย์เกี่ยวกับการติดกระจก โดยมีกระจกทั้งหมด 3 ชนิด โดยมีความกว้าง 5 เมตร 4 เมตร 
        //และ 1 เมตรตามลำดับ นำมาติดกระจกโดยมีความกว้าง ตามที่เรากำหนด ในที่นี้กำหนด 10 เมตร 
        //จากนั้นหาว่ามีวิธีไหนบ้าง ที่ใส่กระจกได้เต็ม 
{
    public static void main(String[] data)
    {
        glass(0, "");
    }
    
    static void glass(int w, String s)
    {
        if (w == 10)
        {
            char[] a = s.toCharArray();
            int p = 0;
            int i = 0;
            int m = 0;
            while (i < a.length)
            {
                if (a[i] == '1') { p = p + 500; }
                if (a[i] == '4') { p = p + 800; }
                if (a[i] == '5') { p = p + 10000; }
                i = i + 1;
            }
            System.out.println(s + " = " + p);
        }
        else
        {
            if (w + 5 <= 10) { glass(w+5, s + '5'); }
            if (w + 4 <= 10) { glass(w+4, s + '4'); }
            if (w + 1 <= 10) { glass(w+1, s + '1'); }
        }
    }
}
