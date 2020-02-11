class ClassAndArray
{
    public static void main(String[] data)
    {
        Book[] all = new Book[3];
        
        all[0] = new Book();
        all[0].price = 170.0;
        
        all[1] = new Book();
        all[1].price = 180.0;
        
        all[2] = new Book();
        all[2].price = 170.0;
        int i = 0;
        while (i < all.length)
        {
            System.out.println(all[i].price);
            i = i + 1;
        }
        
    }
}

class Book
{
    double price;
}


