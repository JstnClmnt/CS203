public class SW1{
	public static void main(String[] args){
		int num=345 ;
		
		System.out.println(sum(num));
		System.out.println(F(num));
		System.out.println(F(num));
		System.out.println(F2(num));
		
	}
	
	public static int sum(int n){
		if(n==0)
			return 0;
		else
			return n+sum(n-1);
	}
	
	public static int F(int n){
		if(n<2)
			return 0;
		else
			return 1+F(n/2);
	}
	
	
	public static int F2(int n){
		if(n<0)
			return F(-n);
		else if(n<10)
			return n;
		else
			return F2(n/10);
	}
}