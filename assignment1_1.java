import java.util.*;

//1)Write a program that takes a numerical grade as input and outputs the corresponding letter
//grade using if-else statements. 

public class assignment1_1 
{
    public static void displayAlphabets(int ino)
    {
        if ((ino > 100) || (ino < 0))
        {
            System.out.println("Invalid input");
            return;
        }
        if (ino > 85)
        {
            System.out.println("Your grade is A+");  
        }
        else if ((ino < 85) && (ino > 75))
        {
            System.out.println("Your grade is A");  
        }
        else if ((ino < 75) && (ino > 65 ))
        {
            System.out.println("Your grade is B");  
        }
        else if ((ino < 65) && (ino > 40))
        {
            System.out.println("Your grade is C");  
        }
        else
        {
            System.out.println("Fail");
        }

    }

    public static void main(String[] args) 
    {
        int ino = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        ino=sobj.nextInt();

        displayAlphabets(ino);
        
    }
    
}
