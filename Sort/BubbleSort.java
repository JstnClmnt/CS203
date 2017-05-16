//Welcome to Jus10's Sorting Algortihms ft Bubble Sort
//Big O=O(n^2) standard,best,worst
import java.util.*;
public class BubbleSort 
{
	
	public static void main(String[] args){
		int[] number={10,9,8,7,6,5,4,3};
		
		bubbleSort(number);
		
		System.out.println("SORTED: "+Arrays.toString(number)+"\n");
	}
	//basically bubble sort is the most common may in sorting algorithms
	//so if you're new to programming, mostly pag naisip mo is gumawa ng sorting programming
	//you'll think of this
	public static int[] bubbleSort(int[] a){
		int comparison=0;
		int iteration=0;
		//composed of 2 loops, so basically n^2 times sya sa loops
		for(int x=0;x<a.length;x++){
			iteration++;
			for(int i=1;i<a.length;i++){
				//so its like compare nya isang number to the number  next of it, kapag mas malaki yung number before, swap nya ituu
				//then loop lang sya ng loop
				//hanggang yung pinakamaliit is makapunta sa dulo, pinakamalki sa kabilang dulo
				//for more info: https://www.youtube.com/watch?v=8Kp-8OGwphY
				comparison++;
				if(a[i-1]>a[i]){
					Swap(a,i,i-1);
				}
			}
		}
		System.out.println("Number of iteration:"+iteration);
		System.out.println("Number of comparison:"+comparison);
		return a;
	}
	
	public static int[] Swap(int A[],int p,int q){
		int temp=0;
		
		temp=A[p];
		A[p]=A[q];
		A[q]=temp;
		
		return A;
					
	}
}