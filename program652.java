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
    public LinkedList <Employee> lobj;

    public CustomisedDBMS()
    {
        System.out.println("Customised DBMS started succesfully...");
        lobj = new LinkedList<Employee>();
    }

    // Insert into Employee values(1,"Sagar","Pune",11000);
    public void InsertIntoTable(String name, String Address, int Salary)
    {
        Employee eobj = new Employee(name,Address,Salary);
        lobj.add(eobj);
    }

    // Select * from emplyee;
    public void SelectStar()
    {
        System.out.println("Data from the Employee Databsae : ");

        for(Employee eref : lobj)
        {
            eref.DisplayInfo();
        }
    }

    // Select * from emplyee where Eid = 3;
    public void SelectSpecific(int ID)
    {
        System.out.println("Information of Employee whose EID is : "+ID);

        for(Employee eref : lobj)
        {
            if(eref.EID == ID)
            {
                eref.DisplayInfo();
                break;
            }
        }
    }
}

class program652
{
    public static void main(String Arg[])
    {
        System.out.println("-------- Customised Database Management System --------");

        CustomisedDBMS mobj = new CustomisedDBMS();

        mobj.InsertIntoTable("Sagar Kulkarni","Karve Road Pune 4",11000);
        mobj.InsertIntoTable("Gaurav Sharma","SB Road Nasik",21000);
        mobj.InsertIntoTable("Chinmayee Patil","LB road Mumbai",20000);
        mobj.InsertIntoTable("Akash Sudame","FC road Satara",25000);
        mobj.InsertIntoTable("Mansi Joshi","Panchavati Nasik",12000);

        mobj.SelectStar();

        mobj.SelectSpecific(4);
        
    }
}