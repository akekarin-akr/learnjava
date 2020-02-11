
class Ex1
{
    public static void main(String[] data)
    {
      Ci c = new Ci(0.5);
      double b = c.area();
      System.out.println(b);
    }
}
class Ci
{
    double ra;
    Ci(double r)
    {
        ra = r;
    }
    double area()
    {
        return Math.PI * ra * ra;
    }
}



class Book 
{
    String name;
    double price;
    
    Book(String n, double p)
    {
        name = n;
        price = p;
    }
    
    // เขียนแบบนี้ก็ได้
    Book(double p)
    {
        this("", p);
    }
}



