import java.util.*;

//4)Write a program that takes a number representing a weekday (1-7) and prints the name of the
//weekday using switch-case. 

public class assignment4_1 
{
    public static void main(String[] args) 
    {
        int Weekdays ;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        Weekdays=sobj.nextInt();

        switch (Weekdays) 
        {
            case 1:
                System.out.println("It is Monday");
                break;

                case 2:
                System.out.println("It is Tuesday");
                break;

                case 3:
                System.out.println("It is Wednesday");
                break;

                case 4:
                System.out.println("It is Thursday");
                break;

                case 5:
                System.out.println("It is Friday");
                break;

                case 6:
                System.out.println("It is Saturday");
                break;

                case 7:
                System.out.println("It is Sunday");
                break;
        
            default:
                System.out.println("Invalid input");
                break;
        }
        
    }


    
}
