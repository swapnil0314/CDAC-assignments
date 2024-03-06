//3. To decide whether a given number is even or odd.
import java.util.*;

public  class  assignment1_3 {

    public static boolean Checkwhether(int ino1)
    {
       
        if((ino1 % 2) == 0)
        {
            return true;
        }
      
       else{return false;}
    

    }


    public static void main(String Args[])
    {
        int ivalue1 = 4 ;
        boolean bRet = false;

        bRet = Checkwhether(ivalue1);
        if (bRet==true) {
            System.out.println(" The given num is even");  
        }
        else
        {
            System.out.println(" The given num is odd");
        }

        

    }
    
}
