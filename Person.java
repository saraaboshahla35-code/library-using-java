package final_project;
import java.io.*;
public abstract class Person implements Serializable{ //Super Class
// Sara Qasem Osama Abu Shahla
// 2320253639
private int PersonID;
private String PersonName;
private char personGender;
private String  PersonPhone;
private String PersonAddress;
public Person() {
}
public Person(int PersonID, String PersonName, char personGender, String PersonPhone, String PersonAddress) {
this.PersonID = PersonID;
this.PersonName = PersonName;
this.personGender = personGender;
this.PersonPhone = PersonPhone;
this.PersonAddress = PersonAddress;
}
public void setPersonID(int PersonID) {
this.PersonID = PersonID;
}
public void setPersonName(String PersonName) {
this.PersonName = PersonName;
}
public void setPersonGender(char personGender) {
this.personGender = personGender;
}
public void setPersonPhone(String PersonPhone) {
this.PersonPhone = PersonPhone;
}
public void setPersonAddress(String PersonAddress) {
this.PersonAddress = PersonAddress;
}
public int getPersonID() {
return PersonID;
}
public String getPersonName() {
return PersonName;
}
public char getPersonGender() {
return personGender;
}
public String getPersonPhone() {
return PersonPhone;
}
public String getPersonAddress() {
return PersonAddress;
}
@Override
public String toString() {
return "Person{" +
        "PersonID=" + PersonID +
        ", PersonName=" + PersonName +
        ", personGender=" + personGender +
        ", PersonPhone=" + PersonPhone +
        ", PersonAddress=" + PersonAddress + '}';
}

}
// Sara Qasem Osama Abu Shahla
// 2320253639 