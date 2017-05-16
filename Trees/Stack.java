//CODE BY JUSTINE CLEMENTE 2CSC

public class Stack<T>{
	
    private int top = -1;
    private int maxStkSize = 99999;
    private Object[] stk;
    private Object[] optr;
    private T el;
	
    public Stack() {
        this.stk = new Object[this.maxStkSize];
    }
	
    public Stack(int n) {
        if (n>0){
            this.maxStkSize = n;
            this.stk = new Object[this.maxStkSize];
        }
    }
    public void clear() {
		while(!this.isEmpty()){
			this.pop();
		}
    }
    public boolean isEmpty() {
        return (this.top == -1);
    }
    public boolean isFull() {
        return (this.top+1 == this.maxStkSize);
    }
    public Object push(T el) {
        if (isFull()) {
           return "Stack is full";
        }
        else{
            this.top++;
            this.stk[this.top] = el;
            return this.stk[this.top];
         }
    }
	
    public T pop(){
        if(isEmpty()) {
        	return null;
        }
        else {	
            this.el = (T)this.stk[this.top];
            this.top--;
            return this.el;
        }
    }
    public T peek() {
        if(isEmpty()) {
            return null;
        }
        else 
            return (T)this.stk[top];
    }
    public void printStack() {
		int x=this.top;
        while(x >=0) {
            System.out.print(this.stk[x]);
            x--;
			
			if(x>=0){
				System.out.print(",");
			}
			
        }
		
		System.out.println("\n");
    }
	
	public String toString(){
		String s="";
		int x=this.top;
		
        while(x >=0) {
            s+=this.stk[x];
            x--;	
        }
		
		return s;
	}
}