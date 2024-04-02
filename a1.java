import java.util.*;

public class a1 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> a = new ArrayList<Integer>();

        for(int i = 0 ; i <= 5 ; i++)
        {
            a.add(i);

        }

        System.out.println("////////////////////////");


        System.out.println(a);


        a.remove(2);


        System.out.println(a);
        
        for(int i = 0 ; i<a.size(); i++)
        {
            System.out.print(a.get(i)+ " ");
        }
        
    }

}    

