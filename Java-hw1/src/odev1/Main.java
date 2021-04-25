package odev1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int studentTotal=0;
		Student student1 = new Student(123456,"İnci", "KÜÇÜK", 3);
		Student student2 = new Student(235682,"İpek", "GÜNEŞ", 4);
		
		
		Student[] students = {student1,student2};
		
		SchoolManager schoolManager = new SchoolManager();
		
		
		for (Student student : students) {
			System.out.println(student.no);
			System.out.println(student.name);
			System.out.println(student.surname);
			System.out.println(student.classNo + "\n");
			studentTotal++;
		
		}
		
		schoolManager.AddStudents(student1);
		schoolManager.AddStudents(student2);
		schoolManager.RemoveStudent(student1);
		
		
		

	}

}
