public class SWSLL{
	public static void main(String[] args){
		SLList<Integer> max=new SLList<Integer>();
		
		max.addtoHead(7);
		max.addtoHead(8);
		max.addtoTail(10);
		max.addtoHead(8);
		
		System.out.println(max.maxInfo());
		System.out.println(max.countOccurence(8));
		System.out.println(max.findNode(0));
		
		SLList<Integer> L=new SLList<Integer>();
		L.addtoHead(22);
		L.addtoHead(19);
		L.addtoHead(16);
		L.addtoHead(14);
		L.addtoHead(12);
		L.addtoHead(8);
		L.addtoHead(6);
		L.addtoHead(5);
		L.addtoHead(2);
		L.addtoHead(1);
		SLList<Integer> P=new SLList<Integer>();
		P.addtoHead(13);
		P.addtoHead(9);
		P.addtoHead(7);
		P.addtoHead(3);
		P.addtoHead(2);
		
		SLList<Integer> wew=max.linkSelected(L,P);
		wew.print();
		
		
		
	}
}