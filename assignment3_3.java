
import java.util.*;
//Write a program that performs arithmetic operations involving different data types (int, double, float)
//and observes how Java handles widening conversions automatically
public class assignment3_3 
{
    public static void main(String[] args) 
    {
        int iAns = 0;
        int  ino1 = 11 , ino2 = 21;
        double ino3 = 51.5 , ino4 = 101.3;
        float ino5 = 3.5f , ino6= 2.8f;


        float addition = (float)ino1+ino5;

        double substraction = (double)ino2-(double)ino5;

        int mult = ino1*(int)ino3;

        System.out.println(addition);
        System.out.println(substraction);
        System.out.println(mult);
    }
}
