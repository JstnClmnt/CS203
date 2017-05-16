import java.awt.event.*;
import java.util.Scanner;
public class FiboN{
	public static void main(String[] args){
		//Scanner scan=new Scanner(System.in);
		
		//long n=scan.nextLong();
		double startTime = (double)System.currentTimeMillis();	
		//System.out.println(fibo(44));
		//41st term=3.102s
		//42nd term=5.14s
		//iterative tong sunod
		System.out.println(fiboI(1400000000));
		//2000000000=5.98s
		//1500000000=4.79s
		//1,300,000,000=3.64s
		double stopTime = (double)System.currentTimeMillis();
		double elapsedTime = (stopTime - startTime)/1000;
		System.out.println((double)elapsedTime);
	  
	}
	
	static long fibo(long n){
		if(n==0||n==1)
			return n;
		else
			return fibo(n-1)+fibo(n-2);
	}
	
	
	static long fiboI(long n){
		long sum=0;
		long first=0;
		long second=1;
	    for(int i=0;i<=n;i++)
		{
			if(i<=1)
				sum=i;
			else
			{
				sum = first + second;
				first = second;
				second = sum;
			}
		}
		return sum;
	}
}