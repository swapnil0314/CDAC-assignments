import java.util.*;
//Write a Program that demonstrates widening conversion from int to (double,float, boolean, string) and
//prints the result.


public class assignment3_4
{
    public static void main(String[] args) 
    {
       
        int ino = 11;
        int ino1 = 120;
        int ino2 = 153;
        int ino3 = 255;

        double d = (double)ino;
        float f = (float)ino1;
        String str = String.valueOf(ino3);


        System.out.println(d);
        System.out.println(f);
        System.out.println(str);
        System.out.println(ino);

        
    }
    
}
