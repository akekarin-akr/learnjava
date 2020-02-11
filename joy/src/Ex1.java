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
        double max = 0.0;
        double min = Double.MAX_VALUE;
        //หา max
        for (int i = 0; i < all.length; i++){
            if (max < all[i].price) { max = all[i].price; }
            System.out.println(all[i].price);
        }
        //หา min
        for (int i = 0; i < all.length; i++)
        {
            if (min > all[i].price) { min = all[i].price; }
        }
        System.out.println("max : " + max + "\n" + "min : " + min);
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