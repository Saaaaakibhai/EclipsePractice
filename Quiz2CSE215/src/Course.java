public class Course {
           private double courseCode;
           private String courseName;
           private double secNo;
         
Course(){
	
}
    Course(double courseCode, String courseName,double secNo){
    	this.courseCode=courseCode;
    	this.courseName= courseName;
    	this.secNo=secNo; 	
    }
	public double getCourseCode() {
		return courseCode;
	}
	public String getCourseName() {
		return courseName;
	}
	public double getSecNo() {
		return secNo;
	}
	public void setCourseCode(double courseCode) {
		this.courseCode = courseCode;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public void setSecNo(double secNo) {
		this.secNo = secNo;
	}
    
}
