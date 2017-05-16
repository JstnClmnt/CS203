import java.util.*;

public class SumArray
{
	static int sum;
	static int counter =1;
	static int length;
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of values you want to add: ");
		int count = in.nextInt();
		int numArray[] = new int[count];
		for (int ctr = 0; ctr < count; ctr++)
		{
			System.out.print("Enter value#"+(ctr+1)+": ");
			numArray[ctr]=in.nextInt();
		}
		length = numArray.length;
		
		System.out.print(sum1(numArray[counter++]));
	}
	public static int sum1(int num)
	{
		if (length == counter)
		{
			return num;
		}
		else
		{
			sum = num+sum1(num);
			counter++;
			return sum;
		}
	}
}