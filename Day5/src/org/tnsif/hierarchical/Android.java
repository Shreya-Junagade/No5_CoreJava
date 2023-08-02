package org.tnsif.hierarchical;

public class Android {
private String brandname;
private String slottype;
public String getBrandname() {
	return brandname;
}
public void setBrandname(String brandname) {
	this.brandname = brandname;
}
public String getSlottype() {
	return slottype;
}
public void setSlottype(String slottype) {
	this.slottype = slottype;
}
@Override
public String toString() {
	return "Android [brandname=" + brandname + ", slottype=" + slottype   + "]";
}
public Android() {
	System.out.println("default");
	
	// TODO Auto-generated constructor stub
}
public Android(String brandname, String slottype) {
	super();
	this.brandname = brandname;
	this.slottype = slottype;
}


}
