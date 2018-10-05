package com.ibm.java.result.entity;

import java.util.List;

public class Students {
	
	private String sname;
	private int maths;
	private int english;
	private int science;
	
	
	public Students(String sname) {
		
		this.sname = sname;
		
	}
	public Students(String sname, int maths, int english, int science) {
		super();
		this.sname=sname;
		this.maths=maths;
		this.science=science;
		this.english=english;
		
		
		
		
		
	}
	

	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	
	@Override
	public String toString() {
		return "Students [sname=" + sname + ", maths=" + maths + ", english=" + english + ", science=" + science + "]";
	}

	

}
