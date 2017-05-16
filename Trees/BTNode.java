 import java.util.Scanner;
 
 /* Class BTNode */
 public class BTNode<T>
 {    
     BTNode<T> left, right,parent;
     T data;
 
     /* Constructor */
     public BTNode()
     {
         left = null;
         right = null;
         data = null;
     }
     /* Constructor */
     public BTNode(T n)
     {
		 parent=null;
         left = null;
         right = null;
         data = n;
     }
	 public BTNode(T n,BTNode p,BTNode x,BTNode y)
     {
		 parent=p;
         left=x;
         right = y;
         data = n;
     }
	 
	 public BTNode(T n,BTNode x,BTNode y)
     {
         left=x;
         right = y;
         data = n;
     }
	 

	 

     /* Function to set left node */
     public void setLeft(BTNode n)
     {
         left = n;
     }
     /* Function to set right node */ 
     public void setRight(BTNode n)
     {
         right = n;
     }
     /* Function to get left node */
     public BTNode getLeft()
     {
         return left;
     }
     /* Function to get right node */
     public BTNode getRight()
     {
         return right;
     }
     /* Function to set data to node */
     public void setData(T d)
     {
         data = d;
     }
     /* Function to get data from node */
     public T getData()
     {
         return data;
     }

	  public String toString(){
		  return data.toString();
	  }
 }