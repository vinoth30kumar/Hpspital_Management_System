package lamdaexp;

import java.util.function.Consumer;

public class ConsumerEx1
{

public static void main(String[] args) 
{
Consumer<String>con=s->System.out.println(s.toUpperCase());
Consumer<String>con1=s->System.out.println("("+s+")");
con.andThen(con1).accept("Hello World");
}

}