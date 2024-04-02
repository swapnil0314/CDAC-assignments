import java.util.*;
/**
 * InnerG2
 */
public class Date 
{
    private int day;
    private int month;
    private int yearr;

    public int getDay()
    {
        return day;
    }
    public void setDay(int day)
    {
        this.day=day;
    }

    public int getmonth()
    {
        return month;
    }
    public void setMonth(int month)
    {
        this.month=month;
    }

    public int getYearr()
    {
        return yearr;
    }
    public void setYear(int yearr)
    {
        this.yearr=yearr;
    }    
}

public class G2 
{
    public static void main(String[] args)
     {
        Date dobj = new Date();
        
        dobj.setDay(03);
        dobj.setMonth(12);
        dobj.setYear(1997);
       
        System.out.print(dobj.getDay());
        System.out.print(dobj.getmonth());
        System.out.print(dobj.getYearr());
        
    }
    
}
