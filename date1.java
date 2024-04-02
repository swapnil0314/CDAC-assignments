import java.time.LocalDate;

/**
 * date1
 */
public class date1 {

    private int day;
    private int month;
    private int year;

    public date1()
    {
        LocalDate ld = LocalDate.now();
        this.day=ld.getDayOfMonth();
        this.month=ld.getMonthValue();
        this.year=ld.getYear();
    }

     public date1(int day , int month , int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
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

    @Override
    public String toString() {
        // 
        return this.day+"/"+this.month+"/"+this.year;
    }

    public static void main(String[] args) {
        
       /*  date1 dobj = new date1();
       System.out.println(dobj);*/

       date1 dobj = new date1(03 , 12 , 1997);
       System.out.println(dobj);
    }
}