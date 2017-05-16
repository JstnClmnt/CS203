/**Graph: Adjacency Matrix */
public class Graphm implements Graph{
	private int[][] matrix; //The edge matrix
	private int numEdge;  //Number of Edges
	public int[] Mark;      //The Mark Array
	
	public Graphm(){}
	public Graphm(int n){
		Mark=new int[n];
		matrix=new int[n][n];
		numEdge=0;
	}
	
	public int n(){
		return Mark.length; //# of Vertices 
	}
	public int e(){
		return numEdge;     //# of edges
	}
	
	/**@return v's first neighbor */
	public int first(int v){
		for(int i=0;i<Mark.length;i++){
			if(matrix[v][i]!=0){
				return i;
			}
		}
		return Mark.length;
		
	}
	
	/**return v's next neighbor after w*/
	public int next(int v, int w){
		for(int i=w+1;i<Mark.length;i++){
			if(matrix[v][i]!=0){
				return i;
			}
		}
		
		return Mark.length;
	}
	
	/**set the weight for an edge */
	public void setEdge(int i, int j, int wt){
		if(wt!=0){
			System.out.println("Cannot set weight to 0!");
		}
		else{
			if(matrix[i][j]==0){
				numEdge++;
				matrix[i][j]=wt;
			}
		}	
	}
	
	/** Delete an edge */
	public void delEdge(int i,int j){
		if(matrix[i][j]!=0){
			numEdge--;
			matrix[i][j]=0;
		}
		
	}
	
	/**Determine if an edge is in the graph */
	public boolean isEdge(int i,int j){
		return matrix[i][j]!=0;
	}
	
	/** return an edge's weight */
	public int weight(int i,int j){
		return matrix[i][j];
	}
	
	/**set/get the mark value for a vertex */
	public void setMark(int v, int val){
		Mark[v]=val;
	}
	
	public int getMark(int v){
		return Mark[v];
	}

}