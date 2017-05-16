public class BTSample{
	public static void main(String[] args){
		BT<Character> bt=new BT<Character>();
		//TOP-DOWN
		
		BTNode n1=bt.setRoot(bt,'A');
		BTNode n2=bt.setLeft(n1,'B');
		BTNode n3=bt.setRight(n1,'D');
		BTNode n4=bt.setLeft(n2,'C');
		BTNode n5=bt.setLeft(n3,'E');
		BTNode n6=bt.setRight(n3,'H');
		BTNode n7=bt.setLeft(n5,'F');
		BTNode n8=bt.setRight(n5,'G');
		BTNode n9=bt.setRight(n6,'I');
		
		System.out.print("\nPost order : ");
			bt.postorder();
        System.out.print("\nPre order : ");
			bt.preorder();
        System.out.print("\nIn order : ");
			bt.inorder();
		
		//BOTTOM-UP
		
		BT<Character> t2=new BT<Character>();
		BTNode an1=new BTNode('C');
		BTNode an2=new BTNode('F');
		BTNode an3=new BTNode('G');
		BTNode an4=new BTNode('I');
		BTNode an5=new BTNode('E',an2,an3);
		BTNode an6=new BTNode('H',null,an4);
		BTNode an7=new BTNode('B',an1,null);
		BTNode an8=new BTNode('D',an5,an6);
		BTNode an9=new BTNode('A',an7,an8);
		an9=t2.setRoot(t2,'A');
		
		//System.out.println(bt.returnLeftChild(n1).toString());
		//System.out.println(bt.returnRightChild(n1).toString());
		System.out.print("\nPost order : ");
			bt.postorder();
        System.out.print("\nPre order : ");
			bt.preorder();
        System.out.print("\nIn order : ");
			bt.inorder();
			
			
			
		System.out.println("\n"+bt.getParent(an8).toString());
		System.out.println(bt.returnLeftChild(an8).toString());
		System.out.println(bt.returnRightChild(an8).toString());
		
		
		
		
	}
}