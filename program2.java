import java.util.*;
class sdate
{
    private int day;
    private int month;
    private int year;

    private String name;
    private int empid;
    private float salary;

    public sdate(int day , int month , int year , String name , int empid , float salary)
    {
        this.day=day;
        this.month=month;
        this.year=year;
        this.name=name;
        this.empid=empid;
        this.salary=salary;

    }

    public int getday()
    {
        return day;
    }
    public void setday(int day)
    {
        this.day=day;
    }

    public int getmonth()
    {
        return month;
    }
    public void setmonth(int month)
    {
        this.month=month;
    }

    public int getyear()
    {
        return year;
    }
    public void setyear(int year)
    {
        this.year=year;
    }
    
     
}
public class program2 
{
    public static void main(String[] args) 
    {
        sdate sd = new sdate(03, 12, 1997, null, 0, 0);

       System.out.println(sd);

        
    }
}
