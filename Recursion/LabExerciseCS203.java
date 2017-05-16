import java.io.*;
import java.util.Scanner;


public class LabExerciseCS203{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		int num;
		int[] arr={0,1,2,3,4,5,6,7,8,9,10};
		System.out.println("Enter a Number: ");
		num=sc.nextInt();
		System.out.println("The factorial is: "+ Factorial(num));
		System.out.println("The nth term of the fibo arg is: "+ Fib(num));
		System.out.println("The power is: "+power1(2,num));
		System.out.println("The power is: "+power2(2,num));
		System.out.println("The sumArray1 is "+SumArr(arr,arr.length-1));
		System.out.println("The sumArray2 is "+sumArr2(arr,3,7));
		System.out.println("The sumArray2 is "+SumArr3(arr,3,7));
	}
	
	public static int Factorial(int x){
		if(x==1){
			return 1;
		}
		else{
			return x*Factorial(x-1);
		}
	}
	public static int Fib(int x){
		if(x==0||x==1){
			return x;
		}
		else{
			return Fib(x-1)+Fib(x-2);
		}
	}
	
	public static int SumArr(int A[],int n){
		if(n==0)
			return A[0];
		else
			return SumArr(A,n-1)+A[n];
	}
	 
	public static int sumArr2(int A[],int start,int n){
		if(n==start) 
			return A[start];
		else
			return A[n]+sumArr2(A,start,n-1);
	}
	
	public static int SumArr3(int[] A,int p,int q){
		if(p==q)
			return A[p];
		else{
			int n=(p+q)/2;
			return SumArr3(A,p,n)+SumArr3(A,n+1,q);
		}
	}
	public static int power1(int base,int n){
		if (n==0){
			return 1;
		}
		else{
			return base*power1(base,n-1);
		}
	}
	
	public static int power2(int base,int n){
		if (n==0){
			return 1;
		}
		else if(n%2==0){
	
			return power2(base,n/2)*power2(base,n/2);
		}
		else{
			return power2(base,n/2)*power2(base,n/2)*base;
		}
	}

}