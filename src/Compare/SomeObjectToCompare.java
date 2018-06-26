package Compare;

public class SomeObjectToCompare {
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	private int id;
	private String name;
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
//	@Override
//	public int compareTo(SomeObjectToCompare obj) {
//		if (this == obj) {
//			return 0;
//		}
//
//		return this.id - obj.id;
//	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof SomeObjectToCompare)) {
			return false;
		}
		SomeObjectToCompare other = (SomeObjectToCompare) obj;
		if (id != other.id) {
			return false;
		}

		return true;
	}

	public SomeObjectToCompare(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public static int compareById(SomeObjectToCompare obj1, SomeObjectToCompare obj2) {
		return obj1.id-obj2.id;
	}
	
	
}
