public class InfixToPostfix{
	public static void main(String[] args){
		String s="A^B+C+D";
		System.out.println(toPostfix(s));
	}
	
	public static String toPostfix(String s){
		Stack<Character> stack=new Stack<Character>();
		String output="";
		
		for(int i=0;i<s.length();i++){
			if(incomingValue(s.charAt(i))==-1&&s.charAt(i)!=')'){
				output+=s.charAt(i);
			}
			else{
				if(s.charAt(i)==')'){
					while(stack.peek()!='('){
						output+=stack.pop();
					}
					stack.pop();
				}
				else{
					while((!stack.isEmpty())&&compareOper(s.charAt(i),stack.peek())){
						output+=stack.pop();
					}
					stack.push(s.charAt(i));
				}
			}
		}
		
		while(!stack.isEmpty()){
			output+=stack.pop();
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
				x=5; break;
			case '/':
				x=4; break;
			case '*':
				x=4; break;
			case '+':
				x=2; break;
			case '-':
				x=2; break;
			case '(':
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
				x=6; break;
			case '/':
				x=3; break;
			case '*':
				x=3; break;
			case '+':
				x=1; break;
			case '-':
				x=1; break;
			case '(':
				x=9; break;
			default:
				x=-1; break;
		}
		return x;
	}
}