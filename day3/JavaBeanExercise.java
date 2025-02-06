package com.celcom.day3;

public class JavaBeanExercise {
	int eid;
	String ename;
	int esalary;
	
	public JavaBeanExercise(int eid, String ename, int esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	
	public int getEid() {
		return eid;
	}
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public int getEsalary() {
		return esalary;
	}
	
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	
	public static void main(String[] args) {
		JavaBeanExercise obj=new JavaBeanExercise(101,"Vishag",10000);
		System.out.println("Id : "+obj.getEid());
		System.out.println("Name : "+obj.getEname());
		System.out.println("Salary : "+obj.getEsalary()+"\n");
		obj.setEid(101);
		obj.setEname("Srivishag");
		obj.setEsalary(15000);
		System.out.println("Id : "+obj.getEid());
		System.out.println("Name : "+obj.getEname());
		System.out.println("Salary : "+obj.getEsalary()+"\n");
	}
	
}
