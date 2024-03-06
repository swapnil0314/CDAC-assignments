//2. To find the average of the two given numbers and print.
class A{
int  Average(int ivalue1 , int ivalue2)
{
    int iAvg = 0 ;

    iAvg = (ivalue1+ivalue2)/2 ;

    return iAvg;
}
}

public class assignment1_2 {

    public static void main(String Args[])
{
    int ino1 = 15 , ino2 = 20 , iRet=0 ;

    A obj = new A();

    iRet=obj.Average(ino1 , ino2);

    System.out.println("The average of two number is : "+iRet);

}
  
}
