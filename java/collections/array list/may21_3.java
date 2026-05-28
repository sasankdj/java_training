// CJA where we have class employee, contains fields like employee ID, employee Name, employee Designation, and employee salary, then provide setter and getter methods for these variables, and create an arraylist, add few employee details to it, then display the arraylist of employees whose salary is greater than average salary and display all the employees in descending order based on salary.


import java.util.*;

class Employee {
    private String emp_id;
    private String emp_name;
    private String emp_designation;
    private Double emp_salary;
    public String getEmp_id() {
        return emp_id;
    }
    public String getEmp_name() {
        return emp_name;
    }
    public String getEmp_designation() {
        return emp_designation;
    }
    public Double getEmp_salary() {
        return emp_salary;
    }
    Employee(String emp_id,String emp_name, String designation,Double salary){
        this.emp_id=emp_id;
        this.emp_name=emp_name;
        this.emp_designation=designation;
        this.emp_salary=salary;
    }
    public String toString(){
        return emp_id+" "+emp_name+" "+emp_designation+" "+emp_salary;
    }
   
}
class salaryComparator implements Comparator<Employee>{
    public int compare(Employee x , Employee y){
        if(x.getEmp_salary()==y.getEmp_salary()){
            return 0;
        }
        if(x.getEmp_salary()>y.getEmp_salary()){
            return -1;
        }
        return 1;
    }
}
public class may21_3 {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<>();
        Employee e1= new Employee("1", "sasank", "student", 10000d);
        Employee e2= new Employee("1", "sasank", "student", 100d);
        Employee e3= new Employee("1", "sasank", "student", 30000d);
        Employee e4= new Employee("1", "sasank", "student", 400d);
        Employee e5= new Employee("1", "sasank", "student", 5000d);

        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);
        al.add(e5);

        Collections.sort(al,new salaryComparator());
    
        al.sort(new salaryComparator());

        for (Employee employee : al) {
            System.out.println(employee);
        }

    }
}
