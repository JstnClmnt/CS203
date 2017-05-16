public class InfixToPrefix{
	public static void main(String[] args){
		String s="A+B+C+D";
		System.out.println(toPrefix(s));
	}
	
	public static String toPrefix(String s){
		Stack<Character> oprtr=new Stack<Character>();//Stack
		Stack<Character> rev=new Stack<Character>();//B
		String output="";
		
		for(int i=s.length()-1;i>=0;i--){
			if(incomingValue(s.charAt(i))==-1&&s.charAt(i)!='('){
				rev.push(s.charAt(i));
			}
			else{
				if(s.charAt(i)=='('){
					while(oprtr.peek()!=')'){
						rev.push(oprtr.pop());
					}
					oprtr.pop();
				}
				else{
					while((!oprtr.isEmpty())&&compareOper(s.charAt(i),oprtr.peek())){
						rev.push(oprtr.pop());
					}
					oprtr.push(s.charAt(i));
				}
			}
		}
		
		while(!oprtr.isEmpty()){
			rev.push(oprtr.pop());
		}
		
		while(!rev.isEmpty()){
			output+=rev.pop();
		}
		
		return output;
	}
	
	public static boolean compareOper(char a,char b){//a is X[i] and b is peek(S)
		if(incomingValue(a)<inStackValue(b))
			return true;
		else
			return false;
	}

	public static int inStackValue(char a){
		int x;
		switch(a){
			case '^':
				x=6; break;
			case '/':	
				x=3; break;
			case '*':
				x=3; break;
			case '+':
				x=1; break;
			case '-':
				x=1; break;
			case ')':
				x=0; break;
			default:
				x=-1; break;
		}
		return x;
	}
	
	public static int incomingValue(char a){
		int x;
		switch(a){
			case '^':
				x=5; break;
			case '/':
				x=4; break;
			case '*':
				x=4; break;
			case '+':
				x=2; break;
			case '-':
				x=2; break;
			case ')':
				x=9; break;
			default:
				x=-1; break;
		}
		return x;
	}
	
}