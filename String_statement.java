public class String_statement {

public static void main(String[] args) {
// TODO Auto-generated method stub

//String statement is not for data types

String name= "vino " + "bj";

int myStringlength = name.length();//length of String
String myStringLowercase= name.toLowerCase();//covert to String is lowercase 
String myStringUppercase= name.toUpperCase();//covert to String is uppercase

System.out.println(myStringlength);
System.out.println(myStringLowercase);
System.out.println(myStringUppercase);
System.out.println(name.replace('j', 'J'));//replace the character 
System.out.println(name.indexOf('l')); // index of character 

}

}
