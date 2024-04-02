import java.time.LocalDate;
import java.util.*;
import java.util.spi.LocaleNameProvider;

public class date2 {

    private int day;
    private int month;
    private int year;
    public date2()
    {
        LocalDate ld = new LocalDate.now();
        ld.getDayOfMonth();
        ld.getMonthValue();
        ld.getYear();
    }
  

    public date2(int day , int month , int year)
    {
        this.setDay=day;
        this.setmonth=month;
        this.setyear=year;
    }

    public int getDay()
    {
        return this.day;
    }
    public void setDay(int day)
    {
        this.day=day;
    }

    public int getmonth()
    {
        return this.month;
    }
    public void setmonth(int month)
    {
        this.month=month;
    }

    public int getYear()
    {
        return this.year;
    }
    public void setyear(int year)
    {
        this.year=year;
    }


    public static void main(String[] args) {
        date2 d = new date2();

        System.out.println(d);
    }

    
}
