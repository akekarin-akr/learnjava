import java.util.*;
//ในกรณีที่มีข้อมูลผสมกันเราใช้ instanceof ได้
class Ex5
{
    public static void main(String[] data)
    {
        ArrayList a = new ArrayList();
        a.add("L");
        a.add(5);
        a.add(7.5);
        a.add("M");
        a.add(new Date());
        
        int c = 0;
        for (int i = 0; i < a.size(); i++)
        {
            System.out.println(a.get(i)); 
            if (a.get(i)instanceof String) 
            { 
                c = c + 1;
            }
        }
        System.out.println("Count of String : " + c);
    }
    
}

