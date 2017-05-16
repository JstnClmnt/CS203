import java.util.*;

public class Factorial
{
	public static int fac;
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		fact(in.nextInt());
		System.out.print(fac);
		
	}
	public static int fact(int n)
	{
		if (n == 1){
			return n;
		}
		else
			fac = n*fact(n-1);
			return fac;
	}
}