import java.util.*;

class Ex5
{
    public static void main(String[] data)
    {
        ArrayList city = new ArrayList(); //สมาชิกใน ArrayList 
        city.add("Talingchan");
        city.add("Bang Yai");
        city.add("Patum Thani");
        city.add("Park Kred");
        String result = "No";
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Area: ");
        String area = in.nextLine();
        
        for (int i = 0; i < city.size(); i++)
        {
            if (area.equals(city.get(i))) { result = "Yes"; }  //ใช้ .equals
        } //ของอาจารย์ แปลง city.get(i) ให้เป็น String ก่อนโดย (String)city.get(i)
        // แนวคิดถ้าจะใส่ตัวเล็กตัวใหญ่ ต้องแปลงให้เป็น String ก่อน
        System.out.println(result);
    }
}
