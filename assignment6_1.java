import java.util.*;

//Implement a program that calculates the Body Mass Index (BMI) based on height and weight
//input using if-else to classify the BMI int categories (underweight, normal weight, overweight,
//etc.)

public class assignment6_1 
{
    public static void CalBodyMass(float w, float h)
    {
        float fbmi=0;

        fbmi=(w/h*h);

        if ((fbmi<18.5)) 
        {
            System.out.println("Underweight");   
        }
        else if ((fbmi > 18.5)||(fbmi < 24.9))
        {
            System.out.println("HealthyWeight");
        }
        else if ((fbmi > 25)||(fbmi < 29.9))
        {
            System.out.println("Overweight");   
        }
        else
        {
            System.out.println("Obesity");
        }


    }

    public static void main(String[] args) 
    {
        float ino1 , ino2 ;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Weight");
        ino1=sobj.nextFloat();

        System.out.println("Enter the height in meter");
        ino2=sobj.nextFloat();
        
        CalBodyMass(ino1, ino2);
    }
    
}
