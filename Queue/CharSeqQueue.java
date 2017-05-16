public class CharSeqQueue{
	public static void main(String[] args){
		
		Queue<Character> q1=new Queue<Character>(4);
		
		q1.enqueue('J');
		//q1.printlnQueue();
		q1.enqueue('K');
		//q1.printlnQueue();
		
		q1.enqueue('L');
		//q1.printlnQueue();
		
		System.out.println(q1.dequeue());
		//q1.printlnQueue();
		
		q1.enqueue('M');
		//q1.printlnQueue();
		System.out.println(q1.dequeue());
		//q1.printlnQueue();
		q1.enqueue('N');
		//q1.printlnQueue();
		q1.enqueue('P');
		//q1.printlnQueue();
		System.out.println(q1.dequeue());
		//q1.printlnQueue();
		System.out.println(q1.dequeue());
		//q1.printlnQueue();
		
		
		//watanays

		
		
		
		
	}
}
