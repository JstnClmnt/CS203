public class SWCS203{
	public static void main(String[] args){
		SLList<Character> slst=new SLList<Character>();	
		slst.addtoHead('A');
		slst.addtoTail('B');
		slst.addtoTail('C');
		slst.addtoTail('D');
		slst.addtoTail('E');
		slst.print();
		SNode p=slst.head;
		SNode r=slst.find('C');
		SNode q=slst.find('D');
		r=p.next;
		q.next.next=p;
		System.out.print(r+"\n"+p+"\n"+p.next);
		p.next=null;
		System.out.println(slst.head+""+slst.tail);
		
		slst.print();
		
		
		
		
		
	}
}