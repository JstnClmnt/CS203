//Code by Justine Clemente 2CSC

public class StringSeq_Clemente{
	public static void main(String[] args){
		Stack<String> s3=new Stack<String>(4);
		
		System.out.println("isEmpty()");
		System.out.println(s3.isEmpty());
		System.out.print("Current Stack: ");
		s3.printStack();
		
		System.out.println("push(''Hercules'')");
		System.out.println(s3.push("Hercules"));
		System.out.print("Current Stack: ");
		s3.printStack();
		
		System.out.println("push(''Ironman'')");
		System.out.println(s3.push("Ironman"));
		System.out.print("Current Stack: ");
		s3.printStack();
		
		System.out.println("pop()");
		System.out.println(s3.pop());
		System.out.print("Current Stack: ");
		s3.printStack();
		
		System.out.println("peek()");
		System.out.println(s3.peek());
		System.out.print("Current Stack: ");
		s3.printStack();
		
		System.out.println("isEmpty()");
		System.out.println(s3.isEmpty());
		System.out.print("Current Stack: ");
		s3.printStack();
		
		System.out.println("push(''Catwoman'')");
		System.out.println(s3.push("Catwoman"));
		System.out.print("Current Stack: ");
		s3.printStack();
		
		System.out.println("pop()");
		System.out.println(s3.pop());
		System.out.print("Current Stack: ");
		s3.printStack();
		
		System.out.println("pop()");
		System.out.println(s3.pop());
		System.out.print("Current Stack: ");
		s3.printStack();
		
		System.out.println("pop()");
		System.out.println(s3.pop());
		System.out.print("Current Stack: ");
		s3.printStack();
		
		System.out.println(s3.push("Superman"));
		System.out.println("push(''Superman'')");
		System.out.print("Current Stack: ");
		s3.printStack();
		
		System.out.println(s3.push("Thor"));
		System.out.println("push(''Thor'')");
		System.out.print("Current Stack: ");
		s3.printStack();
		
		System.out.println("push(''Wolverine'')");
		System.out.println(s3.push("Wolverine"));
		System.out.print("Current Stack: ");
		s3.printStack();
		
		System.out.println("push(''Batman'')");
		System.out.println(s3.push("Batman"));
		System.out.print("Current Stack: ");
		s3.printStack();
		
		System.out.println("push(''Darna'')");
		System.out.println(s3.push("Darna"));
		System.out.print("Current Stack: ");
		s3.printStack();
		
	}
}