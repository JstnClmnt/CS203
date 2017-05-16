//Welcome to Jus10's sorting algorithm ft. Insertion Sort
//Big O=O(n^2) worst case, O(n) at best case.
import java.util.*;
public class InsertionSort 
{
	static int pass=0;
	static int iteration=0;
	public static void main(String[] args) 
	{
			int[] number={5,3,4,7,2,8,6,9,1};
		
			insertionSort(number);
		
			System.out.println("SORTED: "+Arrays.toString(number)+"\n");
			
	}
	//so insertion sort
	//is like playing cards, so sa mga mahilig sa mga sugal dyan, it's your lucky day!
	public static int[] insertionSort(int [] a){
		int comparison=0;
		// the item to be inserted
		//the most common na ginagawa sa insertion, leftmost value is considered sorted, then the number next to it
		//is selected as the "card"
		//and then, yung card icocompare sa values before sakanya, kung mas malaki ba sya kesa sa values before
		//kapag mas malaki, swap niya itu.
		//kaya kung mapapansin nyo, isang for loop lang gamit ko, kasi yung leftmost is considered sorted sa first loop
		//then yung while loop is for the sake of the checking of the so called "card"
		//may mas complex type pero mas efficient for insertion, pero as of now, hindi ko siya magawa :)
		//for more info: https://www.youtube.com/watch?v=DFG-XuyPYUQ&t=157s
		//boolean isGreater;
		for (int j = 1; j < a.length; j++)    // Start with 1 (not 0)
		{
			pass++;
			for(int i = j;i>0; i--)
			{
				if(a[i]<a[i-1]){
					comparison++;
					Swap(a,i,i-1);
				}
			}
		}

		System.out.println("Number of Comparisons:"+comparison);
		System.out.println("Number of Passes:"+pass);
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