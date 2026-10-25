package final_project;
import java.io.*;
public class Author extends Person implements Serializable{
// Sara Qasem Osama Abu Shahla
// 2320253639
private int NumOfBooks;
private String Email;
private String Workplace;
public Author() {
}
public Author(int NumOfBooks, String Email, String Workplace, int PersonID, String PersonName, char personGender, String PersonPhone, String PersonAddress) {
super(PersonID, PersonName, personGender, PersonPhone, PersonAddress);
this.NumOfBooks = NumOfBooks;
this.Email = Email;
this.Workplace = Workplace;
}
public void setNumOfBooks(int NumOfBooks) {
this.NumOfBooks = NumOfBooks;
}
public void setEmail(String Email) {
this.Email = Email;
}
public void setWorkplace(String Workplace) {
this.Workplace = Workplace;
}
public int getNumOfBooks() {
return NumOfBooks;
}
public String getEmail() {
return Email;
}
public String getWorkplace() {
return Workplace;
}
@Override
public String toString() {
return  super.toString() +
        "Author{" + 
        "NumOfBooks=" + NumOfBooks +
        ", Email=" + Email +
        ", Workplace=" + Workplace + '}';
}
}
// Sara Qasem Osama Abu Shahla
// 2320253639 