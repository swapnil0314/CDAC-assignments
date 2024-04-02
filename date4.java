

class datee {
    private String name;
    private int empid;
    private int salary;

    public datee(String name, int empid , int salary)
    {
        this.name=name;
        this.empid=empid;
        this.salary=salary;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public int getempid()
    {
        return empid;
    }
    public void setempid(int empid)
    {
        this.empid=empid;
    }

    public int getsalary()
    {
        return salary;
    }
    public void setsalary(int salary)
    {
        this.salary=salary;
    }   
}

public class date4
 {
    public static void main(String[] args) 
    {
        datee d = new datee("sapnil", 03, 45000);

        System.out.println(d);
        
    }
    
}
