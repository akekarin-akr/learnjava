import java.util.*;
// ArrayList
class Ex3
{
    public static void main(String[] data)
    {
        ArrayList a = new ArrayList();
        a.add("Latte");
        a.add("Mocha");
        a.add("Espresso"); //สมาชิกเป็น Object
        System.out.print(a);
        System.out.println(a.get(2)); //ปริ้นทีละตัว ArrayList
        System.out.println(a.size()); // เอาไว้หาขนาด ArrayList
        
        
        System.out.println("------------------------");
        for (int i = 0; i < a.size(); i++)
        {
            System.out.println(a.get(i));
        }
        
        
        System.out.println("------------------------");
        for (int i = a.size() - 1; i >= 0; i--)
        {
            System.out.println(a.get(i));
        }
    }
}


