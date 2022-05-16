

import java.util.ArrayList; 


public class Arraylist {

public static void main(String[] args) {
ArrayList<Integer> myList = new ArrayList<Integer>(5);

myList.add(1);
myList.add(99);
myList.add(56);
myList.add(77);
myList.add(84);
myList.add(33);
myList.add(81);

for (Integer x : myList)
System.out.println(x);
System.out.println("my Array Size= "+myList.size());
myList.remove(2);//remove for arrayList one list

System.out.println("--------After one List Removing Array-----------------");

for (Integer x : myList)
System.out.println(x);
System.out.println("my Array Size= "+myList.size());

System.out.println("----- change List-----");	

for (Integer x : myList)
System.out.println(x);
System.out.println("my Array Size= "+myList.size());
myList.set(3,11);// change In list 
myList.trimToSize();

System.out.println("---- After Changing List-----");
for (Integer x : myList)
System.out.println(x);
System.out.println("my Array Size= "+myList.size());


}

}

