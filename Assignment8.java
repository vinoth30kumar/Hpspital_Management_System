package assignment6975;
import java.util.Iterator;
import java.util.Vector;

class Emp1
{
private int id;
private String name;
private String address;
private Double salary;

public Emp1(int id, String name, String address, double salary) {
super();
this.id = id;
this.name = name;
this.address = address;
this.salary = salary;
}	

public int getId() {
return id;
}

@Override
public String toString() 
{
return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
}
}
public class Assignment8 
{

public static void main(String[] args) 
{
        Vector<Employee> list = new Vector<>();

list.add(new Employee(101, "vino", "123 street, India", 20000.0));
list.add(new Employee(102, "bala", "234 street, India", 30000.0));
list.add(new Employee(103, "yuva", "345 street, India", 25000.0));
list.add(new Employee(104, "arun", "456 street, India", 40000.0));

Iterator<Employee> it = list.iterator();
while (it.hasNext()) 
System.out.println(it.next());


}

}
