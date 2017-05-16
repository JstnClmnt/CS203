public interface Graph{
	
	/** @return the number of vertices */
	public int n();
	
	/** @return the current number of edges */
	public int e();
	
	/** @return v's first neighbor */
	public int first(int v);
	
	/** @return v's next neighbor after w*/
	public int next(int v,int w);
	
	/** set the weight for an edge
		@param i,j the vertices
		@param wght Edge weight */
	public void setEdge(int i,int j,int wght);
	
	/** Delete an edge
		@param i,j the vertices */
	public void delEdge(int i,int j);
	
	/**Determine if an edge is in the graph
		@param i,j inthe vertices
		@return true if edge i,j has non-zero weight */
	public boolean isEdge(int i,int j);
	
	/**@return the weight of edge i,j, or zero
		@param i,j the vertices*/
	public int weight(int i, int j);
	
	/** set the mark value for a vertex
		@param v the vertex	@param val inthe value to set */
	public void setMark(int i, int val);
	
	/** Get the mark value for a vertex
		@param v the vertex
		@return the value of the mark*/
	public int getMark(int v);


}