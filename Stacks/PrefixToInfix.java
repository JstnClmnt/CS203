public class PrefixToInfix{
	public static void main(String[] args){
		String s="+*+A^BCD^EF";
		
		System.out.println(convertInfix(s));
	}
	
	static String convertInfix(String a){
		Stack<String> s=new Stack<String>();
		for(int i=a.length()-1;i>=0;i--){
				if(isOperand(a.charAt(i))){
					s.push(String.valueOf(a.charAt(i)));
				}
				else{
					String A=s.pop();
					String B=s.pop();
					String x="("+A+String.valueOf(a.charAt(i))+B+")";
					s.push(x);
				}
				
		}
		
		return s.pop();
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