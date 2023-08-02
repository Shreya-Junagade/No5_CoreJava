package org.tnsif.hierarchical;

public class SnowCone extends Tiamisu{
	private int frontcam;

	public int getfrontcam() {
		return frontcam;
	}

	public void setfrontcam(int frontcam) {
		this.frontcam= frontcam;
	}

	@Override
	public String toString() {
		return "SnowCone[frontcam=" + frontcam + ", Version()=" + getVersion() + ", Brandname()=" + getBrandname()
				+ ", Slottype()=" + getSlottype()  + "]";
	}

	

	public SnowCone() {
		System.out.println("child one");
	
		// TODO Auto-generated constructor stub
	}

	public SnowCone(String brandname, String slottype,int frontcam,int version) {
		super(brandname,slottype,version);
		this.frontcam=frontcam;
}
}
