import java.util.Scanner;
import java.util.*;
/**
 * assignment2_3
 */
public class assignment2_3 {

    public class Box
    {
        
        int height = 0 ;
        int width = 0 ;
        int breadth = 0 ;
        

        public static int getVolume(int h , int w , int b)
        {
            int V = (h*w*b);

            return V;
        }

        public static int getArea(int h , int w , int b)
        {
            int A = 2*(h*w)+2*(h*b)+2*(w*h);

            return A;
        }

}
    
public static void main(String args[])
{
    Scanner sobj = new Scanner(System.in);

    int h =0 , w = 0 , b = 0;

    System.out.println("Enter height: ");
    System.out.println("Enter width: ");
    System.out.println("Enter breadth: ");
    h=sobj.nextInt();
    w=sobj.nextInt();
    b=sobj.nextInt();

    int vol = Box.getArea(h,w,b);
    int Area = Box.getArea(h,w,b);

    System.out.println("The volume of box is : "+vol);

    System.out.println("The area of the box is : "+Area);

}
}

