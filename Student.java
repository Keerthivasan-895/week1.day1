package week1.day1;

public class Student {   //Created a class student
	
int rollno=2343;  //Created a global variable

public static void main(String[] args) {
	
	Student obj=new Student(); //Created object for the Student class
	
	int update=obj.rollno;
	System.out.println("Roll Number" + - update); //Calling the global variable called rollno
	obj.CollegeName();  //Calling the CollegeName method
	System.out.println(obj.CollegeCode()); //Calling the CollegeCode method
	int studentCount=obj.CollegeStudentCount();
	System.out.println("Number Of Students " + - studentCount); //Calling the CollegeStudentCount method
}
 public void CollegeName() {  //Created a College method
	 System.out.println("SRM University");
 }
 
 public short CollegeCode() {
	 short collegeCode=3245;   //Created the variable name inside the College method
	 return collegeCode;
 }
	 public int CollegeStudentCount() {
		 int collegeCount=3534534;
		 return collegeCount;
	 } }
 
 