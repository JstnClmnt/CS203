import java.util.Scanner;

public class MP3CS203{
	public static void main(String[] args){
		String resp="Y";
		Scanner sc=new Scanner(System.in);
		while(resp.equals("Y")||resp.equals("y")){
			
			String s="";
			
			try{
				System.out.println("Enter Equation:");
				s=sc.nextLine();
				System.out.println(convertInfix(s));
			}
			catch(NullPointerException npe){
				System.out.println("Invalid Expression");
			}
			catch(NumberFormatException nfe){
				System.out.println("Too many operands!");
			}
			System.out.println("Again?Y/N: ");
			resp=sc.nextLine();
			
		}
	}
	
	static String convertInfix(String a){
		Stack<String> s=new Stack<String>();
		String x="";
		for(int i=0;i<a.length();i++){
				if(isOperand(a.charAt(i))){
					//System.out.println(a.charAt(i));
					s.push(String.valueOf(a.charAt(i)));
				}
				else{
					String B=s.pop();
					String A=s.pop();
					if(A.equals(null)||B.equals(null)){
						throw new NullPointerException();
					}
					x="("+A+String.valueOf(a.charAt(i))+B+")";
					//System.out.println(x);
					s.push(x);
				}
				
		}
		
		String y=s.pop();
		
		if(s.isEmpty()){
			return y;
		}
		else{
			throw new NumberFormatException();
		}
		
	}
	
	static boolean isOperand(char x){
		switch(x){
			case '^':
				return false;
			case '/':
				return false;
			case '*':
				return false;
			case '+':
				return false;
			case '-':
				return false;
			default:
				return true;
		}
	}
	
}