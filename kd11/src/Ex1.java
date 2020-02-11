// Summary.java
import java.util.*;
class Ex1
{
    public static void main(String[] data)
    {
        Arrays.sort(data);
        int c = 1;
        for(int i = 1; i < data.length; i++)
        {
            if(data[i].equals(data[i-1]))
            {
                c +=1;
            } else
            {
                System.out.println(data[i-1] + " = " + c);
                c = 1;
            }
        }
        System.out.println(data[data.length-1] + " = " + c);
        
    }
}

