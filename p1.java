import java.util.*;


 class Date
 {
    int datee , month , year;

    public void AcceptDate()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the date , month and year ");

        datee=sobj.nextInt();
        month=sobj.nextInt();
        year=sobj.nextInt();
    }

    public void DisplayDate()
    {
        System.out.println(datee+"/"+month+"/"+year);
    }

 }
public class p1 
{
    public static void main(String[] args) 
    {
        Date dobj = new Date();  
        dobj.AcceptDate();
        dobj.DisplayDate();
        
    }

    
}