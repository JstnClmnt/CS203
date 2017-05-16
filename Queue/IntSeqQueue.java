public class IntSeqQueue{
	public static void main(String[] args){	
		Queue<Integer> q2=new Queue<Integer>(4);
		
		q2.enqueue(15);
		q2.enqueue(28);
		System.out.println(q2.dequeue());
		q2.enqueue(31);
		System.out.println(q2.peek());
		System.out.println(q2.dequeue());
		System.out.println(q2.dequeue());
		q2.enqueue(47);
		System.out.println(q2.peek());		
		q2.enqueue(54);
		System.out.println(q2.dequeue());
		q2.enqueue(66);
		q2.clear();
		q2.enqueue(66);
		System.out.println(q2.dequeue());
		
		
		
		
		
		
		
	}
}