import java.io.*;


public class MAXVALUE
{

   static int max = 0;
	public static int MaxVal(int[] numArray, int first, int last) 
	{

		
		if (first == last) 
			return max;
	    else
		{
			if(max < numArray[last])
				max = numArray[last];
			
			return MaxVal(numArray, first, last-1);
		}
	
	}
    
	
	public static void main(String [] args)
	{
		int [] numArray = {10, 200, 40, 30, 70, 20, 2111};
	    int first = 0;
		int last = 6;
		
		System.out.print(MaxVal(numArray, first, last));
		
	}
		
}
