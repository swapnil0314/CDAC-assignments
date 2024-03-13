import java.util.*;

//Write a program that takes a character as input and determines whether it’s a vowel or a
//consonant using if-else. 

public class assignment5_1 
{
    public static void CheckVowel(char ch)
    {
        if ((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
        {
            System.out.println("It is a vowel");
        }
        else
        {
            System.out.println("It is a consonant");
        }

    }

    public static void main(String[] args) 
    {
        char ch ='\0';
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the character : ");
        
        ch=sobj.next().charAt(0);

        CheckVowel(ch);
    }
    
}
