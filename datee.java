

import java.time.LocalDate;


public class Date
{
	private int day;
	private int month;
	private int year;

public void  AcceptDate(int day, int month , int year)
{
	this.setDay(day);
	this.setMonth(month);
	this.setYear(year);

	System.out.println(this.day+"/"+this.month+"/"+this.year);

} 

public static void main(String args[])
{
	Date d = new Date();
	d.AcceptDate( 3 , 12 , 1997);

}

}