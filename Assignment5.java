package assignment6975;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
class Employee 
{
private int id;
private String name;
private String address;
private Double salary;

public Employee(int id, String name, String address, double salary) 
{
super();
this.id = id;
this.name = name;
this.address = address;
this.salary = salary;
}	


@Override
public String toString() 
{
return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
}


public int getId() {
// TODO Auto-generated method stub
return 0;
}


}
public class Assignment5 
{

public static void main(String[] args) 
{
        List<Employee> list = new ArrayList<>();

list.add(new Employee(101, "vino", "123 street, India", 20000.0));
list.add(new Employee(102, "dhiva", "234 street, India", 30000.0));
list.add(new Employee(103, "yuva", "345 street, India", 25000.0));
list.add(new Employee(104, "bala", "456 street, India", 40000.0));

Iterator<Employee> it = list.iterator();
int searchId = 102;
while (it.hasNext()) {
Employee emp = it.next();
if (emp.getId() == searchId)
System.out.println(emp);
}
}
}