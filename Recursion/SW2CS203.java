
//write a recursive function that returns the number of digits in a non-negative number;

public class SW2CS203{
	public static void main(String[] args){
		System.out.println(CountDigits(1000));
		reverse(432);
	}
	
	public static int CountDigits(int n){
		if(n<=0)
			return 0;
		else
			return 1+CountDigits(n/10);
	}
	
	public static void reverse(int i){
		if(i==0){
			System.out.println("");
		}
		else{
			System.out.print(i%10);
			reverse(i/10);
			//System.out.println(i%10);
			}
	}
}