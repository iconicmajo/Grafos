/**
 * Maria José Castro Lemus 
 * 181202
 * Estructura de datos 
 * Seccion 60
 * HT9
 */

/**
 * @author Majo!
 * @param <V>
 *Atributos de cada una de las lineas que se leen del dooc de texto
 */
public class Graph<V> {
	private V vertex1;
	private V vertex2;
	private int distance;
	private boolean visit;
	
	/**
	 * @param vertex1
	 * @param vertex2
	 * @param distance
	 * @param visit
	 */
	public Graph(V vertex1, V vertex2, int distance, boolean visit) {
		this.vertex1 = vertex1;
		this.vertex2 = vertex2;
		this.distance = distance;
		this.visit = visit;
	}

	/**
	 * @return the vertex1
	 */
	public V getVertex1() {
		return vertex1;
	}

	/**
	 * @param vertex1 the vertex1 to set
	 */
	public void setVertex1(V vertex1) {
		this.vertex1 = vertex1;
	}

	/**
	 * @return the vertex2
	 */
	public V getVertex2() {
		return vertex2;
	}

	/**
	 * @param vertex2 the vertex2 to set
	 */
	public void setVertex2(V vertex2) {
		this.vertex2 = vertex2;
	}

	/**
	 * @return the distance
	 */
	public int getDistance() {
		return distance;
	}

	/**
	 * @param distance the distance to set
	 */
	public void setDistance(int distance) {
		this.distance = distance;
	}

	/**
	 * @return the visit
	 */
	public boolean isVisit() {
		return visit;
	}

	/**
	 * @param visit the visit to set
	 */
	public void setVisit(boolean visit) {
		this.visit = visit;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Graph [ciudad 1=" + vertex1 + ", ciudad 2=" + vertex2 + ", distance =" + distance + ", visitado =" + visit
				+ "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + distance;
		result = prime * result + ((vertex1 == null) ? 0 : vertex1.hashCode());
		result = prime * result + ((vertex2 == null) ? 0 : vertex2.hashCode());
		result = prime * result + (visit ? 1231 : 1237);
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Graph other = (Graph) obj;
		if (distance != other.distance)
			return false;
		if (vertex1 == null) {
			if (other.vertex1 != null)
				return false;
		} else if (!vertex1.equals(other.vertex1))
			return false;
		if (vertex2 == null) {
			if (other.vertex2 != null)
				return false;
		} else if (!vertex2.equals(other.vertex2))
			return false;
		if (visit != other.visit)
			return false;
		return true;
	}
	

}
