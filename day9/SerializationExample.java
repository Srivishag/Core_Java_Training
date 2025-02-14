package com.celcom.day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	private int eid;
	private String ename;
	private int esalary;

	public Employee(int eid, String ename, int esalary) {
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

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + " ,esalary=" + esalary + "]";
	}
}

public class SerializationExample {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// Serialization
		Employee vishag = new Employee(101, "Srivishag P", 15000);
		FileOutputStream fout = new FileOutputStream(
				"D://Java Workspace//MyJavaProject//src//com//celcom//day8//ObjectFile.txt");
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		objout.writeObject(vishag);
		objout.close();
		fout.close();
		System.out.println("Object Saved");

		// Deserialization
		FileInputStream fin = new FileInputStream(
				"D://Java Workspace//MyJavaProject//src//com//celcom//day8//ObjectFile.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		vishag = (Employee) objin.readObject();
		System.out.println(vishag);
		objin.close();
		fin.close();
	}
}
