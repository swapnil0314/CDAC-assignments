import java.nio.file.AccessDeniedException;
import java.util.*;

//3)Implement a simple calculator program that takes two numbers and an operator (+, -, *, /) as
//input and performs the operation using switch-case. 

public class assignment1_3 
{
    public static void calculator(int ino , int ino1)
    {
        void Addition(int ino , int ino1)
            {
                int iAns = ino+ino1;
                System.out.println("The addition is "+iAns);
            }
    
            
            void Substraction(int ino , int ino1)
            {
                int isub = ino-ino1;
                System.out.println("The Substraction is "+isub);
            }
    
           
            void Multiplication(int ino , int ino1)
            {
                int imult = ino*ino1;
                System.out.println("the multiplication is : "+imult);
            }
    
            void Division(int ino , int ino1)
            {
                float iDiv=0.0f;
                float fDiv = ino/ino1;
                
                System.out.println("The div is : "+iDiv);
            }
    }
    public static void main(String[] args) 
    {
        int ino = 0, ino1 = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        ino=sobj.nextInt();

        System.out.println("Enter the second number  : ");
        ino1=sobj.nextInt();

            
        
        
        
    }
    
}
