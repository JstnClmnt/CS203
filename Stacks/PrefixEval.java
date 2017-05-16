public class PrefixEval{
	public static void main(String[] args){
		String s="-/*986-7+21";
		System.out.println(evaluatePostfix(s));
	}
	
	
	static int evaluatePostfix(String a){
		Stack<Integer> s=new Stack<Integer>();
		
		for(int i=a.length()-1;i>=0;i--){
				if(isOperand(a.charAt(i))){
					int y=Integer.parseInt(String.valueOf(a.charAt(i)));
					//System.out.println(y);
					s.push(y);
				}
				else{
					int A=s.pop();
					int B=s.pop();
					int x=eval(A,a.charAt(i),B);
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
	
	
	
	static int eval(int A,char e, int B){
		switch(e){
			case '^':
				return power(A,B);
			case '/':
				return div(A,B);
			case '*':
				return mult(A,B);
			case '+':
				return add(A,B);
			case '-':
				return sub(A,B);
			default:
				return 0; 
		}
	}
	
	static int power(int a,int b){
		int pow=0;
		for(int i=0;i<b;i++){
			pow*=a;
		}
		
		return pow;
	}
	
	static int div(int a, int b){
		return a/b;
	}
	
	static int mult(int a,int b){
		return a*b;
	}
	
	static int add(int a, int b){
		return a+b;
	}
	
	static int sub(int a, int b){
		return a-b;
	}

}