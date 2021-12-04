public class Exam {
    private String examType;
    private String examName;
    private double totalMarks;    
    private double attemptingStudents;
    Exam(){
    	
}
    Exam(String examType,String examName,double totalMarks,double attemptingStudent){
	this.examType= examType;
	this.examName= examName;
	this.totalMarks = totalMarks;
	this.attemptingStudents=attemptingStudent;
}
	public String getExamType() {
		return examType;
	}
	public String getExamName() {
		return examName;
	}
	public double getTotalMarks() {
		return totalMarks;
	}
	public double getAttemptingStudents() {
		return attemptingStudents;
	}
	public void setExamType(String examType) {
		this.examType = examType;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public void setTotalMarks(double totalMarks) {
		this.totalMarks = totalMarks;
	}
	public void setAttemptingStudents(double attemptingStudents) {
		this.attemptingStudents = attemptingStudents;
	}
    
}
