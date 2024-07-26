import java.util.*;

class Employee
{
    public int EID;
    public String Ename;
    public String EAddress;
    public int ESalary;

    private static int Counter;

    static
    {
        Counter = 0;
    }

    public Employee(String B, String C, int D)
    {
        this.EID = ++Counter;
        this.Ename = B;
        this.EAddress = C;
        this.ESalary = D;
    }

    void DisplayInfo()
    {
        System.out.println("EID : "+EID+" Name : "+Ename+" Address : "+EAddress+" Salary : "+ESalary);
    }
}

class CustomisedDBMS
{
    public CustomisedDBMS()
    {
        System.out.println("Customised DBMS started succesfully...");
    }
}

class program648
{
    public static void main(String Arg[])
    {
        System.out.println("-------- Customised Database Management System --------");

        CustomisedDBMS mobj = new CustomisedDBMS();

        LinkedList <Employee>lobj = new LinkedList<Employee>();

        Employee eobj1 = new Employee("Sagar","Pune",21000);
        Employee eobj2 = new Employee("Pooja","Satara",11000);

        lobj.add(eobj1);
        lobj.add(eobj2);

        for(Employee eref : lobj)
        {
            eref.DisplayInfo();
        }
    }
}