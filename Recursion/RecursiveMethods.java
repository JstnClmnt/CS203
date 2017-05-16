	import java.util.*;
import java.util.Random;
import java.util.Scanner;
public class RecursiveMethods{
	public static void main(String[] args){
		int SumArray;
		int[] Array={24,22,25,26,27};
		String[] wtf2={"hello","i","am","justine"};
		String wtf="racecar";
		
		//System.out.println(Palindrome(wtf,0,wtf.length()-1));
		//System.out.println(isAscend(Array,0,Array.length-1));
		//System.out.println(MaxVal(Array,0,Array.length-1));
		//System.out.println(Great1(Array,0,Array.length-1	));
		//printAscend(10);
		//printDescend(10);
		/*Reversal(Array,0,4);
		for(int i=0;i<Array.length;i++){
			System.out.println(Array[i]);
		}*/
		
		/*Shuffle(wtf2,0,3);
		for(int i=0;i<wtf2.length;i++){
			System.out.println(wtf2[i]);
		}*/
		
		//System.out.println(Factorial(5));
		//SumArr(Array,4);
		//sumArr2(Array,0,4);
		//SumArr3(Array,0,4);
		
		//tail(5);
		//nontail(5);
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
		
	public int powerR1(int base,int n){
		if (n==0){
			return 1;
		}
		else{
			return base*powerR1(base,n-1);
		}
	}
	
	public float powerR2(float base,float n){
		if (n==0){
			return 1;
		}
		else if(n<0){
			n=n*-1;
			return 1/(base*powerR2(base,n-1));
		}
		else{
			return base*powerR2(base,n-1);
		}
	}
	
	public static int[] Reversal (int A[],int p,int q){
		if(p==q){
			return A;
		}
		else{
			Swap(A,p,q);
			return Reversal(A,p+1,q-1);
		}
	}
	//1.6-17a
	public static int MaxVal(int A[],int p,int q){
		if(q==0){
			return A[q];
		}
		else{
			if(A[q]>A[p]){
				return MaxVal(A,p,q-1);
			}
		else{
			Swap(A,p,q);
			 return MaxVal(A,p,q-1);
			}
		}
	}
	public static void Switch(String D[], String s, String t, int n){
        if(D[n].equals(s)){
            D[n] = t;
        }
        
        if(n!=0){
            Switch(D, s, t, n-1);
        }
        
    }
	public static int[] Swap(int A[],int p,int q){
		int temp=0;
		
		temp=A[p];
		A[p]=A[q];
		A[q]=temp;
		
		return A;
					
	}
	//1.6-17b
	public static int Great1(int A[],int p,int q){
		if(q==0){
			return 0;
		}
		else{
			if(A[p]<A[q]){
				return Great1(A,p,q-1)+1;
			}
			else{
				return Great1(A,p,q-1);
			}
		
	}
	//Palindrome 1.6-17c
	public static boolean  Palindrome(String A,int p,int q){
		if(p==q){

			return true;
		}
		else if(A.charAt(p)==A.charAt(q)){
			return Palindrome(A,p+1,q-1);
		}
		else{
			return false;
		}	
	}
	static int ascend=1;
	public static boolean isAscend(int A[],int p,int q){
		if(q==0){
			return true;
		}
		else if(ascend==2){
			return false;
		}
		else{
			if(A[q]>A[p]){
				return isAscend(A,p,q-1);
			}
			else if(A[p]==A[q]){
				ascend+=1;
				return isAscend(A,p,q-1);
			}
			else{
				return false;
			}
			
		}
	}
	static int asc=1;
	public static void printAscend(int n){
		if(n==1){
			System.out.println(1);
		}
		else{
			printAscend(n-1);
			System.out.println(n);
		}
	}
	
	public static int printDescend(int n){
		if(n==1){
			System.out.println(n);
			return 1;
		}
		else{
			System.out.println(n);
			return printDescend(n-1);
		}
	}
	public static void Shuffle(String D[], int p, int q) {
       Random rng = new Random();
       int num= (int)(100*(double)Math.round(rng.nextDouble()*100d)/100d) % D.length;
       System.out.println(Math.round(rng.nextDouble()));
       if (p!=q) {
           String temp = D[num];
            D[num] = D[p];
            D[p]=temp;
            
              Shuffle(D, p+1, q); 
        }
    }
	static int counter=0;
	 public static int HanoiTower(int n, String fromP, String toP, String useP){
        if(n>0){
                    HanoiTower(n-1, fromP,useP,toP);
                    System.out.println("move disk "+ n+ " from the " + fromP + " post to the toP " + "post.");
                    HanoiTower(n-1, useP, toP, fromP);
                         
                 }
                   return counter++; 
       

	}
	//First out Last in
	public static void tail(int i){
		if(i>0){
			System.out.println(i);
			System.out.println(" ");
			tail(i-1);
		}
	}
	//Last in First out
	public static void nontail(int i){
		if(i>0){
			nontail(i-1);
			System.out.println(i);
			System.out.println(" ");
		}
	}
}	