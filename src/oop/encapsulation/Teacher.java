package oop.encapsulation;

public class Teacher {
	private String SSN;
	private String address;
	private String name;
	private String DOB;
	
	public Teacher(){
	}
	
	public Teacher(String dOB, String sSN, String address, String name) {
		super();
		DOB = dOB;
		SSN = sSN;
		this.address = address;
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
		
	}
	


	
	
