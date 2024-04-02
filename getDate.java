
public class getDate 
{
    private int day;
    private int month;
    private int year;

    public getDate(int day , int month , int year)
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

    public int getMonth()
    {
        return this.month;
    }
    public void setMonth(int month)
    {
        this.month=month;
    }


    public int getYear()
    {
        return this.year;
    }
    public void setYear(int year)
    {
        this.year=year;
    }

    public void display()
    {
        System.out.println(this.day+"/"+this.month+"/"+this.year);
    }

    public static void main(String[] args) 
    {
        getDate d = new getDate(03,12,1997);

        d.display();
        
    }


    
}
