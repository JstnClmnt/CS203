public class Queue<T>
	{
		private int maxQsize=100;
		private int front = -1, rear = -1;
		private Object[] que;
		public Queue()
		{
			this.que =  new Object[maxQsize];
		}
	
		public Queue(int n)
		{
			if(n  > 0) 
				this.maxQsize = n;
			this.que = new Object[maxQsize];
		}
	
		public void clear()
		{
			this.front=-1;
			this.rear=-1;
		}
		
		public boolean isEmpty()
		{
			return(this.front == -1);
		}
	
		public boolean isFull()
		{
			return((this.rear+1) % this.maxQsize == this.front);
		}
	
		public T enqueue(T el)
		{
			if(isFull())
			{
				System.out.println("Queue is Full");
				return null;
			}
			if(isEmpty())
			{
				this.front = 0;
			}
			this.rear = (this.rear + 1) % maxQsize;
			this.que[rear] = el;
			return el;
		}
	
		public T dequeue()
		{
			if(isEmpty())
			{
				return null;
			}
			T el = (T) this.que[front];
			if(this.front == this.rear)
			{
				this.clear();
			}
			else
			{
				this.front = (this.front + 1) % this.maxQsize;
			}
			return el;
		}
	
		public  T peek()
		{
			if(isEmpty())
			{
				return null;
			}
			else
			{
				return (T) this.que[front]; 
			}
		}
		
		public void printQueue(){
			int x=this.front;
			
			if(this.isEmpty()){
				System.out.println("null");
			}
			
			else if(this.front==this.rear){
				System.out.print(this.que[x]);
			}
			
			else{
				do{
					if(this.que[x]!=null){
						System.out.print(this.que[x]+",");
						x=(x+1)%this.maxQsize;
					}
				}while(x!=this.rear);
				System.out.print(this.que[rear]);
			}
			
		}
	}