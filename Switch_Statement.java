import java.util.Scanner;

public class Switch_Statement {

public static void main(String[] args) {
// TODO Auto-generated method stub

Scanner Scan = new Scanner(System.in);
System.out.println("enter the Score of Student");

int Soure=Scan.nextInt();

// byte, short, int , char

switch (Soure)// Multiple condition in given switch statement
{
case 90:
System.out.println("very Good");
break;

case 60:
System.out.println("good");
break;

case 44:// without break this colculate two case condition
case 45:
System.out.println("ok");
break;

default:
System.out.println("The student fail");
break;






}

}

}
