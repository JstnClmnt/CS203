/* Class BT */
public class BT<T>
 {
     private BTNode root;
 
     /* Constructor */
     public BT()
     {
         root = null;
     }
	 public BTNode setRoot(BT t,T n)
	 {
		 t.root=new BTNode(n);
		 return t.root;
	 }
	 
	 public BTNode getParent(BTNode t){
		 return t.parent;
	 }
	 
	 public BTNode returnLeftChild(BTNode t){
		return t.left;
	 }
	 public BTNode returnRightChild(BTNode t){
		 return t.right;
	 }
	 

	 
	 /* Function to set left node */
     public BTNode setLeft(BTNode t, T n)
     {
         t.left =new BTNode(n);
		 return t.left;
     }
     /* Function to set right node */ 
     public BTNode setRight(BTNode t,T n)
     {
         t.right =new BTNode(n);
		 return t.right;
     }
     /* Function to check if tree is empty */
     public boolean isEmpty()
     {
         return root == null;
     }
     /* Functions to insert data */
     public void insert(T data)
     {
         root = insert(root, data);
     }
     /* Function to insert data recursively */
     private BTNode insert(BTNode node, T data)
     {
         if (node == null)
             node = new BTNode(data);
         else
         {
             if (node.getLeft() == null)
                 node.left = insert(node.left, data);
             else
                 node.right = insert(node.right, data);             
         }
         return node;
     }     
     /* Function to count number of nodes */
     public int countNodes()
     {
         return countNodes(root);
     }
     /* Function to count number of nodes recursively */
     private int countNodes(BTNode r)
     {
         if (r == null)
             return 0;
         else
         {
             int l = 1;
             l += countNodes(r.getLeft());
             l += countNodes(r.getRight());
             return l;
         }
     }
     /* Function to search for an element */
     public boolean search(T val)
     {
         return search(root, val);
     }
     /* Function to search for an element recursively */
     private boolean search(BTNode r, T val)
     {
         if (r.getData() == val)
             return true;
         if (r.getLeft() != null)
             if (search(r.getLeft(), val))
                 return true;
         if (r.getRight() != null)
             if (search(r.getRight(), val))
                 return true;
         return false;         
     }
     /* Function for inorder traversal */
     public void inorder()
     {
         inorder(root);
     }
     private void inorder(BTNode r)
     {
         if (r != null)
         {
             inorder(r.getLeft());
             System.out.print(r.getData() +" ");
             inorder(r.getRight());
         }
     }
     /* Function for preorder traversal */
     public void preorder()
     {
         preorder(root);
     }
     private void preorder(BTNode r)
     {
         if (r != null)
         {
             System.out.print(r.getData() +" ");
             preorder(r.getLeft());             
             preorder(r.getRight());
         }
     }
     /* Function for postorder traversal */
     public void postorder()
     {
         postorder(root);
     }
     private void postorder(BTNode r)
     {
         if (r != null)
         {
             postorder(r.getLeft());             
             postorder(r.getRight());
             System.out.print(r.getData() +" ");
         }
     }


	public void breadthFirst(){
		Queue<BTNode> q=new Queue<BTNode>();
		BTNode p=this.root;
		if(p!=null){
			q.enqueue(p);
			while(!q.isEmpty()){
				p=q.dequeue();
				System.out.print(p.getData()+" ");
				if(p.left!=null){
					q.enqueue(p.left);
				}
				if(p.right!=null){
					q.enqueue(p.right);
				}
			}
		}
	}
 }