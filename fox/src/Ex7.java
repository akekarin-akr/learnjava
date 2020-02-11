class Ex7 //เป็นตัวอย่างเกี่ยวกับการใช้ Loop for 
{
    public static void main(String[] data)
    {
        String[] coffee = { "a", "b", "c", "d", "e" };
        for (int i = 0; i < coffee.length; i++)
        {
            System.out.println(coffee[i]);
        }
        System.out.println("\nor\n");
        
        for (String j: coffee)
        {
            System.out.println(j);
        }
    }
}
