/** Aaron M. Guiang 2ITF */

public class TestStack
{
	public static void main(String[] args)
	{
		Stack<Integer> s2 = new Stack(4);
		s2.push(10);
		s2.push(20);
		System.out.println(s2.pop());
		s2.push(30);
		System.out.println(s2.peek());
		System.out.println(s2.pop());
		System.out.println(s2.pop());
		s2.push(40);
		System.out.println(s2.peek());
		s2.push(50);
		System.out.println(s2.pop());
		s2.push(60);
		s2.clear();
		s2.push(70);
		System.out.println(s2.pop());
		System.out.println();
		System.out.println();
		System.out.println();

		Stack<Character> s1 = new Stack(4);
        s1.push('A');
        s1.push('B');
        s1.push('C');
        System.out.println(s1.pop());
        s1.push('D');
        System.out.println(s1.pop());
        s1.push('E');
        s1.push('F');
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        s1.push('G');
        System.out.println(s1.pop());
        s1.push('H');
        System.out.println(s1.pop());
        System.out.println(s1.pop());
		System.out.println();
		System.out.println();
		System.out.println();
        

        Stack<String> s3 = new Stack(4);
        System.out.println(s3.isEmpty());
        s3.push("Hercules");
        s3.push("Ironman");
        System.out.println(s3.pop());
        System.out.println(s3.peek());
        System.out.println(s3.isEmpty());
        s3.push("Catwoman");
        System.out.println(s3.pop());
        System.out.println(s3.pop());
        System.out.println(s3.pop());
        s3.push("Superman");
        s3.push("Thor");
        s3.push("Wolverine");
        s3.push("Batman");
        System.out.println();
        System.out.println();
        System.out.println();
	}
}