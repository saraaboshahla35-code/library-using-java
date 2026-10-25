package final_project;
import java.io.Serializable;
public class Student extends Person implements Serializable { //Sub Class
// Sara Qasem Osama Abu Shahla
// 2320253639
private int StudentID;
private String Specialization;
private String EnrolledDate;
private double Budget;
public Student() {
}
public Student(int StudentID, String Specialization, String EnrolledDate, double Budget, int PersonID, String PersonName, char personGender, String PersonPhone, String PersonAddress) {
super(PersonID, PersonName, personGender, PersonPhone, PersonAddress);
this.StudentID = StudentID;
this.Specialization = Specialization;
this.EnrolledDate = EnrolledDate;
this.Budget = Budget;
}
public void setStudentID(int StudentID) {
this.StudentID = StudentID;
}
public void setSpecialization(String Specialization) {
this.Specialization = Specialization;
}
public void setEnrolledDate(String EnrolledDate) {
this.EnrolledDate = EnrolledDate;
}
public void setBudget(double Budget) {
this.Budget = Budget;
}
public int getStudentID() {
return StudentID;
}
public String getSpecialization() {
return Specialization;
}
public String getEnrolledDate() {
return EnrolledDate;
}
public double getBudget() {
return Budget;
}
@Override
public String toString() {
return  super.toString() +
        "Student{" +
        "StudentID=" + StudentID + 
        ", Specialization=" + Specialization +
        ", EnrolledDate=" + EnrolledDate +
        ", Budget=" + Budget + '}';
}
}
// Sara Qasem Osama Abu Shahla
// 2320253639 