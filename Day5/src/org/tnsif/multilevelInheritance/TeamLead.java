package org.tnsif.multilevelInheritance;
//CHLD CLASS2
//PARENT CLASS 2
public class TeamLead extends Manager {
	private String leadName;
	private int empId;
	private String projectName;

	//get set
	public String getLeadName() {
		return leadName;
	}
	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	@Override
	public String toString() {
		return "TeamLead [leadName=" + leadName + ", empId=" + empId + ", projectName=" + projectName
				 +" " + super.toString() + "]";
	}
	public TeamLead(String leadName, int empId,String projectName,String deptName, String name, int empid) {
		super(deptName, name, empid);
		this.leadName = leadName;
		this.empId = empId;
		this.projectName = projectName;
	
	}
	

}
