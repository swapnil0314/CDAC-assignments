import java.time.LocalDate;
import java.util.*;

public class date3 
{

    private int day;
    private int month;
    private int year;

    public date3()
    {
        LocalDate ld = LocalDate.now();
        this.day=ld.getDayOfMonth();
        this.month=ld.getMonthValue();
        this.year=ld.getYear();
    }

    public void displayDate()
    {
        System.out.println(this.day);
    }

    public static void main(String[] args) {

        date3 dobj = new date3();
        
        System.out.println("TOday's date is : ");

        dobj.displayDate();
        
    }
    
}
