//4. To find the factorial of a given number.

public class assignment1_4 {

    public static int Factorial(int ino)
    {
        int iFact = 1;
        int iCnt = 0 ;

        for(iCnt=ino ; iCnt>0 ; iCnt--)
        {
            iFact = iFact*iCnt;
        }
        return iFact;
    }


    public static void main(String[] args) 
    {
        int ivalue = 5;
        int iRet = 0;

        iRet=Factorial(ivalue);

        System.out.println("The factorial of a given number is : "+iRet);
        
    }
    
}
