package odev1;

public class Student {
	
	public Student() {
		System.out.println("the student's information has arrived!");
	}
	
	public Student(int no, String name,String surname,int classNo) {
		//this();
		this.no = no;
		this.name = name;
		this.surname = surname;
		this.classNo = classNo;
	}
	
	int no;
	String name;
	String surname;
	int classNo;
}
