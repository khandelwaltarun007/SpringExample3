package com.spring.example3;

public class Organisation {
	private int orgno;
	private String orgname;
	private String location;
	public int getOrgno() {
		return orgno;
	}
	public void setOrgno(int orgno) {
		this.orgno = orgno;
	}
	public String getOrgname() {
		return orgname;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	public String displayInfo() {
		return "Organisation Number : "+orgno+"\n Organisation Name : "+orgname+"\n Location : "+location;
	}
	
}
