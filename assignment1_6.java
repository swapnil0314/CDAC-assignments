public class assignment1_6 {

   static class Calculations
{

     void sum(int ino1, int ino2)
    {
        System.out.println(ino1+ino2);
    }

    void Avg(int ino1 , int ino2)
    {
        System.out.println((ino1/ino2)/2);
    }

     void Product(int ino1 , int ino2)
    {
        System.out.println(ino1*ino2);
    }

}

    public static void main(String[] args) 
    {
        int ivalue1 = 3 , ivalue2 = 4;

        Calculations obj = new Calculations();

        obj.sum(ivalue1, ivalue2);
        obj.Avg(ivalue1, ivalue2);
        obj.Product(ivalue1, ivalue2);
        
    }
    
}
