//CODE BY JUSTINE CLEMENTE 2CSC

public class IntSeq_Clemente{
	public static void main(String[] args){
		Stack<Integer> s2=new Stack<Integer>(4);
		
				
		System.out.println("push(10)");
		s2.push(10);
		System.out.print("Current Stack: ");
		s2.printStack();
		
		System.out.println("push(20)");
		s2.push(20);
		System.out.print("Current Stack: ");
		s2.printStack();
		
		System.out.println("pop()");
		System.out.println(s2.pop());
		System.out.print("Current Stack: ");
		s2.printStack();
		
		System.out.println("push(30)");
		s2.push(30);
		System.out.print("Current Stack: ");
		s2.printStack();
		
		
		System.out.println("peek()");
		System.out.println(s2.peek());
		System.out.print("Current Stack: ");
		s2.printStack();
		
		System.out.println("pop()");
		System.out.println(s2.pop());
		System.out.print("Current Stack: ");
		s2.printStack();
		
		System.out.println("pop()");
		System.out.println(s2.pop());
		System.out.print("Current Stack: ");
		s2.printStack();
		
		System.out.println("push(40)");
		s2.push(40);
		System.out.print("Current Stack: ");
		s2.printStack();
		
		System.out.println("peek()");
		System.out.println(s2.peek());
		System.out.print("Current Stack: ");
		s2.printStack();
		
		System.out.println("push(50)");
		s2.push(50);
		System.out.print("Current Stack: ");
		s2.printStack();
		
		System.out.println("pop()");
		System.out.println(s2.pop());
		System.out.print("Current Stack: ");
		s2.printStack();
		
		System.out.println("push(60)");	
		s2.push(60);
		System.out.print("Current Stack: ");
		s2.printStack();
		//System.out.println(s2.toString());
		
		System.out.println("clear()");
		s2.clear();
		System.out.print("Current Stack: ");
		s2.printStack();
		
		System.out.println("push(70)");
		s2.push(70);
		System.out.print("Current Stack: ");
		s2.printStack();
		
		System.out.println("pop()");
		System.out.println(s2.pop());
		System.out.print("Current Stack: ");
		s2.printStack();
		
		
		
	}
}