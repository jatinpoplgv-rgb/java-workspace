package ForLoops;

public class EmployeeDriver
{
    public static void main(String args[])
    {
        Employee emp1 = new Employee("jatin", "Management", 125000, 2);
        Employee emp2 = new Employee("abhay", "Management", 35000, 5);
        Employee emp3 = new Employee("bhanu", "cleaner", 11500, 8);
        Employee emp4 = new Employee("dhum", "IT", 24500, 4);
        Employee emp5 = new Employee("anjali", "Agriculture Department", 100000, 2);
        Employee emp6 = new Employee("abhi", "defence", 35000, 1);

        Employee employes[] = new Employee[6];

        employes[0] = emp1;
        employes[1] = emp2;
        employes[2] = emp3;
        employes[3] = emp4;
        employes[4] = emp5;
        employes[5] = emp6;


        // Salary more than 50000
        for (int i = 0; i < employes.length; i++)
        {
            if (employes[i].salary > 50000)
            {
                System.out.println( "Salary more than 50000 : " + employes[i].employeName + " " + employes[i].department + " " + employes[i].salary + " " + employes[i].experience);
            }
        }


        // Experience more than 5 years
        for (int i = 0; i < employes.length; i++)
        {
            if (employes[i].experience > 5)
            {
                System.out.println("Experience more than 5 years : "+ employes[i].employeName + " "+ employes[i].department + " "+ employes[i].salary + " "+ employes[i].experience);
            }
        }


        // Highest salary
        Employee Highest = employes[0];

        for (int k = 1; k < employes.length; k++)
        {
            if (employes[k].salary > Highest.salary)
            {
                Highest = employes[k];
            }
        }

        System.out.println("Highest salary is : "+ Highest.employeName + " "+ Highest.department + " "+ Highest.salary);


        // Lowest salary
        Employee Lowest = employes[0];

        for (int l = 1; l < employes.length; l++)
        {
            if (employes[l].salary < Lowest.salary)
            {
                Lowest = employes[l];
            }
        }

        System.out.println("Lowest salary is : "+ Lowest.employeName + " "+ Lowest.department + " "+ Lowest.salary);
        
        // how many people belongs to It
        
        Employee department = null;

        for (int m = 0; m < employes.length; m++)
        {
            if (employes[m].department.equals("IT"))
            {
                department = employes[m];
            }
        }

        System.out.println("Employee of IT department: " + department.employeName);
        
        // Total salary of the employes
        
        
        int totalSalary = 0 ;
        
        for (int n = 0; n < employes.length; n++)
        {
          totalSalary = totalSalary + employes[n].salary;
        }
        	System.out.println("totalSalary :" +totalSalary);
        
        
        
    }
}