import java.util.*;

class Person
{
private String name;
private int roll;
private float income;

public String getName()
{
    return name;
}
public void setName(String name)
{
    this.name=name;
}

public int getRoll()
{
    return roll;
}
public void setRoll(int roll)
{
    this.roll=roll;
}

public float getincome()
{
    return income;
}
public void setincome(float income)
{
    this.income=income;
}
}
public class G1 
{ 
    public static void main(String[] args) 
{
    Person pobj = new Person();

    pobj.setName("Sapnil\n");
    System.out.println(pobj.getName());

    pobj.setRoll(391);
    System.out.println(pobj.getRoll());

    pobj.setincome(55000.0f);
    System.out.println(pobj.getincome());

}
  
 
}

