import java.util.*;
class Strart
{
    public static void main(String[] data)
    {
        
        
        Coffee c = new Coffee("Latte", 80.0);
        
        Coffee[] all = {
            new Coffee("Latte", 80.0),
            new Coffee("Mocha", 90.0),
            new Coffee("Espresso", 70.0)
        };
        
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

// การ Sort วิธีที่ 2
class Coffee implements Comparable
{
    @Override public int compareTo(Object o)
    {
        Coffee x = (Coffee) this;
        Coffee y = (Coffee) o;
        if (x.price < y.price) return -1;
        if (x.price > y.price) return +1;
        return 0;
    }
}


