package org.tnsif.hierarchical;

public class Tiamisu extends Android{
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Tiamisu [   Version()=" + getVersion() + ", Brandname()=" + getBrandname()
				+ ", Slottype()=" + getSlottype()  + "]";
	}

	public Tiamisu() {
		System.out.println("child one");
		// TODO Auto-generated constructor stub
	}

	public Tiamisu(String brandname, String slottype,int version) {
		super(brandname, slottype);
		this.version=version;
		// TODO Auto-generated constructor stub
	}

	

}
