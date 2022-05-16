package assignment6975;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Assignment3 {

public static void main(String[] args) 
{
List<String> list = new ArrayList<>();
list.add("vino");
list.add("dhiva");
list.add("yuva");
list.add("bala");

printAll(list);
}

public static void printAll(List<String> list) 
{
Iterator<String> it = list.iterator();

while (it.hasNext())
System.out.println(it.next());
}
}