public class PostfixToInfix{
	public static void main(String[] args){
		String s="ABC/DE^^F*-G+";
		
		System.out.println(convertInfix(s));
	}
	
	static String convertInfix(String a){
		Stack<String> s=new Stack<String>();
		for(int i=0;i<a.length();i++){
				if(isOperand(a.charAt(i))){
					System.out.println(a.charAt(i));
					s.push(String.valueOf(a.charAt(i)));
				}
				else{
					String B=s.pop();
					String A=s.pop();
					String x="("+A+String.valueOf(a.charAt(i))+B+")";
					System.out.println(x);
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