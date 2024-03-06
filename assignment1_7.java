import java.util.*;

class assignment1_7{
	
class temperature
{
	
	public static void temp(int itemp)
	{
	
	if(itemp>=85)
	{System.out.println("Its Hot");}
	
	else if((itemp<85)||(itemp>=60))
	{System.out.println("Its very nice out there");} 

	else if((itemp<60)||(itemp>=50))
	{System.out.println("Its chilly , wear a light jacket");}

	else
	{System.out.println("It's cold");}
	}

	public static void main(String[] args)
	{
	
	Scanner sobj = new Scanner(System.in);
	
	int ivalue = 0 ;
	System.out.println("Enter the temperature: ");
	ivalue = sobj.nextInt();
	
	temp(ivalue);
	}

}
}