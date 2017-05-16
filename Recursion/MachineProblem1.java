import java.util.Scanner;

public class MachineProblem1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of Items[1-10]: ");
		int num=sc.nextInt();
		int A[]=new int[num];
		
		for(int i=0;i<num;i++){
			System.out.println("Enter Number " + (i+1) +":");
			A[i]=sc.nextInt();
		}
		
		System.out.println("Find a Number:");
		num=sc.nextInt();
		
		System.out.println("Number of items greater than zero :" + A(A,A.length-1));
		System.out.println("Item "+ num + " is in Index "+ B(A,num,A.length-1));
		//System.out.println(A(A,A.length-1));
		//System.out.println(B(B,15,B.length-1));
		
		String s="String wtf";
		System.out.println(CountWord(s,s.length()-1));
		System.out.println(WordCount(s,s.length()-1));
	}
	
	static int A(int A[],int p){
		if(p<0){
			return 0;
		}	
		else{
			if(A[p]>0){
				return A(A,p-1)+1;
			}
			else{
				return A(A,p-1);
			}
		}
	}
	
	static int B(int A[],int num,int start){
		if(start<0){
			return 0;
		}
		else{
			if(A[start]==num){
				return start;
			}
			else{
				return B(A,num,start-1);
			}
		}
	}
	
	static int CountWord(String s, int p){
		if(p<0){
			return 0;
		}
		else{
			return  CountWord(s,p-1)+1;
		}
		
	}
	
	
	static int WordCount(String s,int p){
		if(p<0){
			return 1;
		}
		else{
			if(Character.isWhitespace(s.charAt(p))){
				return WordCount(s,p-1)+1;
			}
			else{
				return WordCount(s,p-1);
			}
		}
	}
}