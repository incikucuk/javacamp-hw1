package odev1;

public class Lessons {
	
	public Lessons() {
		
	}
	public Lessons(int lessonid,String lessonName,String lessonDetails) {
		this.lessonId = lessonid;
		this.lessonName = lessonName;
		this.lessonDetails = lessonDetails;
	}
	
	
	int lessonId;
	String lessonName;
	String lessonDetails;
}
