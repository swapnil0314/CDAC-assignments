import java.util.*;

//2)Write a program that checks if a given year is a leap year or not using both if-else and
//switch-case. 
//
public class assignment1_2 
{
    public static void CheckLeapYear(int ino)
    {
        if ((ino % 400 == 0) || (ino % 4 == 0)) 
        {
            System.out.println("It is a leap year");
        }
        else
        {
            System.out.println("It is not a leap year ");
        }

    }

    public static void main(String[] args) 
    {
        int ino = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the year to check it is leap year or not  : ");
        ino=sobj.nextInt();

        CheckLeapYear(ino);
        
    }
    
}
