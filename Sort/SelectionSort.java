import java.util.*;
//O(nlogn)
public class SelectionSort{
	static int comparison=0;
	static int pass=0;
	public static void main(String[] args){
		int [] data= {10,9,8,7,6,5,4,3,2,1}; 
		selectionSort(data);
		System.out.println("Comparison:"+comparison);
		System.out.println("Passes:"+pass);
		System.out.println(Arrays.toString(data));
	}
	public static int[] selectionSort(int[] a){
		for(int i=0;i<a.length-1;i++){
			pass++;
			Swap(a,i,findMin(a,i,a.length));
		}
		
		return a;
	}
	public static int findMin(int[] a,int min,int max){
		int index=min;
		//int comparison=0;
		for(int i=min;i<max;i++){
			if(a[i]<a[index]){
				comparison++;
				index=i;
			}
		}
		//System.out.println(index);
		return index;
	}
	
	public static int[] Swap(int A[],int p,int q){
		int temp=0;
		
		temp=A[p];
		A[p]=A[q];
		A[q]=temp;
		
		return A;
					
	}
}