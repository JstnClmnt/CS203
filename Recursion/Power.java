import java.io.*;

public class Power
{
	public static double bas;
	public static double exp;
	public static double ans;
	
	public static void main(String[] args) throws IOException
	{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter base: ");
		bas=Double.parseDouble(in.readLine());
		System.out.print("Enter exponent: ");
		exp = Double.parseDouble(in.readLine());
		//pow(bas,exp));
		System.out.print(pow(bas,exp));
		
	}
	public static double pow(double bas, double exp)
	{
		if(exp < 0)
		{
			return (1/bas)*pow(bas,exp+1);
		}
		else if  (exp==1&&exp >0){
			return 1;
		}
		else {
			return bas*pow(bas,exp-1);
				
		}
	}
}