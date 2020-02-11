
import java.util.*;

class Ex2
{
    public static void main(String[] data)
    {
        Coffee[] all = {
            new Coffee("Latte", 80.0),
            new Coffee("Mocha", 90.0),
            new Coffee("Espresso", 70.0)
        };
        
        //ใช้ Sort --------1 Comparator
        Arrays.sort(all, new CoffeeSort());
        for (Coffee f: all)
        {
            System.out.println(f.name);
        }
    }
}


//------1 Comparator
class CoffeeSort implements Comparator
{
    @Override public int compare(Object a, Object b)
    {
        Coffee x = (Coffee) a;
        Coffee y = (Coffee) b;
        if (x.price < y.price) return -1;
        if (x.price > y.price) return +1;
        return 0;
    }
}


class Coffee
{
    String name;
    double price;
    //ถ้าเราตั้งชื่อตัวแปลเหมือนกันจะมีปัญหา
    //เราต้องแก้ด้วย this
    Coffee(String name, double price)
    {
        this.name = name;
        this.price = price;
    }
}