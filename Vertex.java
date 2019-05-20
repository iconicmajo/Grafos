/**
 * Maria José Castro Lemus 
 * 181202
 * Estructura de datos 
 * Seccion 60
 * HT9
 */

/**
 * @author Majo!
 * Esta clas implementa algunosde los metodos que estaban 
 * en la clase Vertex del libro Java Structrures
 *
 */
public class Vertex<E>{
	private E ciudad;
    private boolean check;
    int pos;

    
    /**
	 * @param ciudad
	 * @param visitado
	 * @param pos
	 */
	public Vertex(E ciudad, int pos, boolean check) {
		this.ciudad = ciudad;
		this.pos = pos;
		this.check= check;
	}


	/**
	 * @return the ciudad
	 */
	public E getCiudad() {
		return ciudad;
	}


	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(E ciudad) {
		this.ciudad = ciudad;
	}


	/**
	 * @return the check
	 */
	public boolean isCheck() {
		return check;
	}


	/**
	 * @param check the check to set
	 */
	public void setCheck(boolean check) {
		this.check = check;
	}
	
	/**
	 * @return check the check to false
	 */
	public void reset() {
		check = false;
	}


	/**
	 * @return the pos
	 */
	public int getPos() {
		return pos;
	}


	/**
	 * @param pos the pos to set
	 */
	public void setPos(int pos) {
		this.pos = pos;
	}
	
	


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (check ? 1231 : 1237);
		result = prime * result + ((ciudad == null) ? 0 : ciudad.hashCode());
		result = prime * result + pos;
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
		Vertex other = (Vertex) obj;
		if (check != other.check)
			return false;
		if (ciudad == null) {
			if (other.ciudad != null)
				return false;
		} else if (!ciudad.equals(other.ciudad))
			return false;
		if (pos != other.pos)
			return false;
		return true;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vertex [ciudad=" + ciudad + ", check=" + check + ", pos=" + pos + "]";
	}

	
	
}