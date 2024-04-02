import java.util.*;

/**
 * Innerp2
 */
class Datee {

    private int day ; 
    private int month ;
    private int year;

    public Datee(int day , int month , int year)
    {
        this.setday(day);
        this.setmonth(month);
        this.setyear(year);
    }


    private void setyear(int year) {
        this.setyear(year);
    }


    private void setday(int day) {
        this.setday(day);
    }


    private void setmonth(int month) {
        this.setmonth(month);
    }

    public void displayDate()
    {
        System.out.println(this.day+"/"+this.month+"/"+this.year);
    }  
}

public class p2 {
    public static void main(String[] args) {
        

        Datee dobj = new Datee(03, 12, 1997);

        dobj.displayDate();
    }
    
}
