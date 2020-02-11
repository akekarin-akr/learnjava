import java.util.*;
// ArrayList
class Ex3
{
    public static void main(String[] data)
    {
        ArrayList a = new ArrayList();
        a.add("Latte");
        a.add("Mocha");
        a.add("Espresso");
        System.out.println(a);
        Collections.sort(a); //เอาไว้ sort ใน ArrayList
        System.out.println(a);
        
    }
}

