import java.util.Scanner;
import java.util.*;
/**
 * assignment2_1
 */
public class assignment2_1 {

    class Room
    {
        public static int Volume(int l , int b , int h)
        {
            int V = (l*b*h);
            
            return V;
        }

    }

    public static void main(String[] args)
     {

        Scanner sobj = new Scanner(System.in);

        Room robj = new Room();

        int height = 0 , width = 0 , breadth = 0 ;

        System.out.println("Enter the height  :");
        height = sobj.nextInt();
        
        System.out.println("Enter the  width  :");
        width = sobj.nextInt();

        System.out.println("Enter the breadth   :");
        breadth = sobj.nextInt();

        int Vol =Room.Volume(height,width,breadth);

        System.out.println("The volume of the room is : "+Vol);

    }   
}