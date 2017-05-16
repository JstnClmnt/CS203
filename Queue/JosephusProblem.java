public class JosephusProblem{
	public static void main(String[] args){
		int m=Integer.parseInt(args[0]);
		int n=Integer.parseInt(args[1]);
		
		Queue<Integer> num=new Queue<Integer>(n);
		Queue<String> person=new Queue<String>(n);
		person.enqueue("Leo");
		person.enqueue("Hello");
		person.enqueue("Fudge");
		person.enqueue("Sean");
		person.enqueue("Justine");
		person.enqueue("Christian");
		person.enqueue("Joshua");
		person.enqueue("Kendrick");
		person.enqueue("Jaen");
		for(int i=0;i<n;i++){
			num.enqueue(i);
		}
		
		String s="";
		
		while(!num.isEmpty()&&!person.isEmpty()){
			for(int i=0;i<m-1;i++){
				num.enqueue(num.dequeue());
				person.enqueue(person.dequeue());
			}
			
			s=person.dequeue();
		}
		
		System.out.println("Last Man Standing: "+s);
		
	}
}