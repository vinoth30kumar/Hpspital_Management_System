public class recursion {
// N! = N * (N-1) * (N-2) * ... * 2 * 1
// 5! = 5 * 4 * 3 * 2 * 1
public static int factorial (int n) {
if (n <=1)
return 1;
else return (n* factorial(n-1));



}

public static void main(String[] args) {
System.out.println(factorial(9));

}

}
