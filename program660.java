import java.util.*;

class Employee {
    public int EID;
    public String Ename;
    public String EAddress;
    public int ESalary;

    private static int Counter;

    static {
        Counter = 0;
    }

    public Employee(String B, String C, int D) {
        this.EID = ++Counter;
        this.Ename = B;
        this.EAddress = C;
        this.ESalary = D;
    }

    void DisplayInfo() {
        System.out.println( EID + "\t" + Ename + "\t" + EAddress + "\t" + ESalary);
    }

}

class CustomisedDBMS {
    public LinkedList<Employee> lobj;

    public CustomisedDBMS() {
        System.out.println("Customised DBMS Started Successfully...");

        lobj = new LinkedList<Employee>();
    }

    // Insert into Employee values(1,"Customised","Pune",210000);

    public void InsertIntoTable(String Name, String Address, int Salary) {
        Employee eobj = new Employee(Name, Address, Salary);
        lobj.add(eobj);

    }

    // Select * from Employee

    public void SelectStar() {
        System.out.println("Data From the employee Database :");
        System.out.println("EID \t Ename \t EAddress\t ESalary");
        for (Employee eref : lobj) {
            eref.DisplayInfo();
        }
    }

    // Select * from Employee Where Eid = 3;
    public void SelectSpecific(int ID) {
        System.out.println("Information of Employee whose EID is :" + ID);
        for (Employee eref : lobj) {
            if (eref.EID == ID) {
                eref.DisplayInfo();
                break;
            }
        }

    }

    // Select * from Employee Where EName = "Sagar"; //Function Overloading
    public void SelectSpecific(String Name) {
        System.out.println("Information of Employee whose NAme is :" + Name);
        for (Employee eref : lobj) {
            if (Name.equals(eref.Ename)) {
                eref.DisplayInfo();

            }
        }

    }

    // Delete From Employee Where EID = 3;
    public void DeleteFrom(int ID) {
        int index = 0;
        boolean bFlag = false;
        for (Employee eref : lobj) {
            if (eref.EID == ID) {
                bFlag = true;
                break;

            }

            index++;

        }

        if (bFlag == false) {
            System.out.println("Unable to delete the element form database as give id is not present");
        } else {
            lobj.remove(index);
        }
    }

    // Delete From Employee Where Ename = "Sagar";
    public void DeleteFrom(String Name) {
        int index = 0;
        boolean bFlag = false;
        for (Employee eref : lobj) {
            if (Name.equals(eref.Ename)) {
                bFlag = true;
                break;

            }

            index++;

        }

        if (bFlag == false) {
            System.out.println("Unable to delete the element form database as give id is not present");
        } else {
            lobj.remove(index);
        }
    }

    //Select sum (ESalary) From Employee;

    public void AggregateSum()
    {
        int iSum=0;
        for(Employee eref:lobj)
        {
            iSum=iSum+eref.ESalary;
        }

        System.out.println("Summation of salary "+iSum);
    }

    //Select MAX(ESalary) From Employee;
    public void AggregateMax()
    {
        int iMax=0;
        for(Employee eref:lobj)
        {

            if(eref.ESalary>iMax)
            {
                iMax=eref.ESalary;
            }
        }

        System.out.println("MAx Salary "+iMax);
    }

     //Select Min(ESalary) From Employee;
     public void AggregateMin()
     {
         int iMin=;
         for(Employee eref:lobj)
         {
 
             if(eref.ESalary<iMin)
             {
                 iMin=eref.ESalary;
             }
         }
 
         System.out.println("MAx Salary "+iMin);
     }

      //Select Avg(ESalary) From Employee;
      public void AggregateAvg()
      {
          int iSum=0;
          for(Employee eref:lobj)
          {
  
              
                iSum=iSum+eref.ESalary;
              
          }
  
          System.out.println("Avg Salary "+(iSum)/lobj.size());
      }

      //Select Count(ESalary) From Employee;
      public void Count()
      {
          
System.out.println("Number of Employee :"+lobj.size());
      }

}

public class program660 {
    public static void main(String[] args) {
        System.out.println("------Customised Database Management System-------");
        CustomisedDBMS mobj = new CustomisedDBMS();

        mobj.InsertIntoTable("Sagar", "Pune", 10000);
        mobj.InsertIntoTable("Shuhbam", "Pune", 210000);
        mobj.InsertIntoTable("Atharv", "Karegaon", 20000);
        mobj.InsertIntoTable("Akash", "Satara", 20000);
        mobj.InsertIntoTable("Aditi", "Lonavala", 20000);

        mobj.SelectStar();
        mobj.DeleteFrom("Sagar");

        mobj.SelectStar();
        mobj.DeleteFrom("Rohan");

        mobj.AggregateSum();
        mobj.AggregateAvg();
        mobj.AggregateMax();
        mobj.AggregateMin();
        mobj.AggregateSum();
        mobj.Count();
    }
}
