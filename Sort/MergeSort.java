//Welcome to jus10's immersive guide to Sorting ft. Merge Sort;
import java.util.*;
public class MergeSort
{
		static int comparison=0;
		static int pass=0;
		public static void main(String[] args){
			int[] number={10,9,8,7,6,5,4,3,2,1};
		
			mergeSort(number);
			System.out.println("Comparison:"+comparison);
			System.out.println("Passes:"+pass);
			System.out.println("SORTED: "+Arrays.toString(number));
		}
		
	    public static int[] mergeSort(int [] list) {
        if (list.length <= 1) {
            return list;
        }
        
        // Hatiin mo sa dalawa ahihihihi
        int[] first = new int[list.length / 2];
        int[] second = new int[list.length - first.length];
		//So basically kinokopya lang yung laman ng array from 0 to middle and middle to end)
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);
        
        // Sort each half, dito na nangyayari yung putanginang recursion.
		//hahatiin hatiin nya hanggang sa maging minimum of 2 na lang yung array
        mergeSort(first);
        mergeSort(second);
        
        // tapos dito imemerge nya yung 2 array, yung last parameter na sinend is yung paglalagyan ng pinagmerge na array
        merge(first, second, list);
        return list;
    }
    
    private static void merge(int[] first, int[] second, int [] result) {
        // Merge both halves into the result array
        // Next element to consider in the first array
        int iFirst = 0;
        // Next element to consider in the second array
        int iSecond = 0;
		pass++;
		//so basically 2 variables, kasi etc etc, teka nakakatamad iexplain.mahaba kasi. hehe
		//https://www.youtube.com/results?search_query=merge+sort
        //what happens here is that, yung 2 arrays, compare nya yung first element of the array to the first element
		//of the other arraycopy
		//considering kasi na sorted na yung 2 arrays, isa sa first element ng arrays na yun eh first element ng merged array.
        // Next open position in the result
        int j = 0;
        // As long as neither iFirst nor iSecond is past the end, move the
        // smaller element into the result.
        while (iFirst < first.length && iSecond < second.length) {
			comparison++;
            if (first[iFirst] < second[iSecond]) {
                result[j] = first[iFirst];
                iFirst++;
            } 
			else {
                result[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
		//Just use a return type instead of  copying each array into the final array :)
		System.arraycopy(first, iFirst, result, j, first.length - iFirst);
        System.arraycopy(second, iSecond, result, j, second.length - iSecond);
        //return result;
    }
}