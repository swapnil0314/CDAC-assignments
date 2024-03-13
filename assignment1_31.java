import java.util.*;

/**
 * assignment1_31|
 * Implement a simple calculator program that takes two numbers and an operator (+, -, *, /) as
input and performs the operation using switch-case. 
 */
public class assignment1_31 
{
    public static void main(String[] args)
    {
        char operator;
        int ino1 , ino2, iAns;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Choose the operation : +,-,*,/");
        operator= sobj.next().charAt(0);

        System.out.println("Enter the first num");
        ino1=sobj.nextInt();

        System.out.println("Enter the second num");
        ino2=sobj.nextInt();

        switch (operator) 
        {
            case '+':
                iAns=ino1+ino2;
                System.out.println("The addition is :"+iAns);
                break;

            case '-':
                iAns=ino1-ino2;
                System.out.println("The sub is : "+iAns);

            case '*':
                iAns=ino1*ino2;
                System.out.println("The multiplication is : "+iAns);

            case '/':
                iAns=ino1/ino2;
                System.out.println("The div is : "+iAns);
        
            default:
                break;
        }
        
    }

    
}