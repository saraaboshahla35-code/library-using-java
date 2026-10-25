package final_project;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
public class Process {
// Sara Qasem Osama Abu Shahla
// 2320253639    
private ArrayList <Book> books;
private ArrayList <Student> students;
private final String BOOKS_FILE = "books.dat";
private final String STUDENTS_FILE = "students.dat";
public Process(){
books = new ArrayList<>();
students = new ArrayList<>();
loadData();
}
public void ShowBooks(){
if (books.isEmpty()){
System.out.println("No Books Available In The Library");
} else {
for(Book  b: books){
System.out.println(b);
}
}
}
public void AddBook(){
Scanner in = new Scanner (System.in);
System.out.println("Enter Book ID");
int Bid = in.nextInt();
in.nextLine();
System.out.println("Enter Book Name");
String Bname = in.next();
in.nextLine();
System.out.println("Enter Book Category");
String Bcategory = in.next();
System.out.println("Enter Author Identity Number");
int Aid = in.nextInt();
in.nextLine();
System.out.println("Enter Author Name");
String Aname= in.nextLine();
in.nextLine();
System.out.println("Enter Author Gender (M/F)");
char  gender = in.next().charAt(0);
in.nextLine();
System.out.println("Enter Author Phone ");
String Aphone = in.nextLine();
in.nextLine();
System.out.println("Enter Author Address");
String Aaddress = in.next();in.nextLine();
System.out.println("Enter Number Of Books Written");
int NoOfBooks = in.nextInt();
in.nextLine();
System.out.println("Enter Author Email");
String Aemail = in.next();
System.out.println("Enter Author Work Place ");
String AworkPlace = in.next();
in.nextLine();
Author author = new Author(NoOfBooks, Aemail, AworkPlace, Aid, Aname, gender, Aphone, Aaddress);
System.out.println("Enter Book Publisher");
String BookPublisher = in.next();
System.out.println("Enter Book Edition Year");
String BookEditionYear = in.next();
System.out.println("Enter Book Price");
double BookPrice = in.nextDouble();
System.out.println("Enter Book Quantity");  
int BookQuantity = in.nextInt();
Book book = new Book (Bid,Bname,Bcategory,author,BookPublisher,BookEditionYear,BookPrice,BookQuantity);
books.add(book);
System.out.println("Book added successfully");
}   
public void DeleteBook(){
Scanner in = new Scanner (System.in);
System.out.println("Enter Book ID");
int Bid = in.nextInt();
boolean foundBook = false;
    for (Book b : books) {
        if(b.getBookID()==Bid){
            books.remove(b);
            foundBook = true;
            System.out.println("Book Deleted Successfully");
            break;
        }
    }
    if(!foundBook){
        System.out.println("NO Book with this ID");
    }
}
public void SearchForA_Book(){
Scanner in = new Scanner (System.in);
System.out.println("Enter Book ID to search for");
int ba=in.nextInt();
boolean IsFound = false;
for(Book b :books){
   if(b.getBookID()==ba){
       System.out.println("Book Found!\n");
       System.out.println(b);
       IsFound=true;
       break;
   } else {
       System.out.println("Invalid Choice");
       return;
   }
}
if(!IsFound){
    System.out.println("Book NOT Found");       
   }
}
public void BuyBook(){
Scanner in = new Scanner (System.in);    
System.out.println("Enter Book ID to buy");
int Bid = in.nextInt();
if(students.isEmpty()){
System.out.println("NO Book with this ID");
}
boolean IsFound=false;
for(Book b : books){
if (b.getBookID()==Bid){
IsFound = true;
System.out.println("Book Bougth Sucessfully");
books.remove(b);
break;
}
}
if (!IsFound) {
        System.out.println("NO Book with this ID");
    }
}
public void ShowStudent(){
if (students.isEmpty()){
System.out.println("No Students Available In The Library");
} else {
for(Student  s: students){
System.out.println(s);
}
}    
}
public void AddStudent(){
Scanner in = new Scanner (System.in);       
System.out.println("Enter Student ID");
int StudentID=in.nextInt();
in.nextLine();
System.out.println("Enter Person Name");
String PersonName=in.next();
System.out.println("Enter person Gender");
char Pgender=in.next().charAt(0);
System.out.println("Enter Person Phone");
String  PersonPhone =in.next();
System.out.println("Enter Person Address");
String PersonAddress=in.next();
System.out.println("Enter Student ID");
int StudentID_UniversityUser=in.nextInt();
System.out.println("Enter Specialization");
String Specialization = in.next();
System.out.println("Enter Enrolled Date");
String EnrolledDate = in.next();
System.out.println("Enter Budget");
double Budget = in.nextDouble();
Student s = new Student (StudentID,Specialization,EnrolledDate,Budget,StudentID_UniversityUser,PersonName,Pgender,PersonPhone,PersonAddress);
students.add(s);
System.out.println("Student Added Successfully");
}
public void FullReport(){
System.out.println("\n======= FULL SYSTEM REPORT =======");
System.out.println("--- All Books In Library ---");
if (books.isEmpty()){
System.out.println("No Books Available In The Library");
} else {
for(Book b: books){
System.out.println(b);
}
}
System.out.println("\n--- All Enrolled Students ---");
if (students.isEmpty()){
System.out.println("No Students Available In The Library");
} else {
for(Student s: students){
System.out.println(s);
}
}
System.out.println("==================================");
try (PrintWriter writer = new PrintWriter(new FileWriter("output.txt"))) {
writer.println("--- All Books In Library ---");
if (books.isEmpty()){
writer.println("No Books Available In The Library");
} else {
for(Book b: books){
writer.println(b.toString());
}
}
writer.println("\n--- All Students ---");
if (students.isEmpty()){
writer.println("No Students Available In The Library");
} else {
for(Student s: students){
writer.println(s.toString());
}
}
writer.println("==================================");
System.out.println("Successfully exported the report to 'output.txt' file!");
} catch (IOException e) {
System.out.println("Error while writing to output.txt file: " + e.getMessage());
}
}
public void saveData(){
try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(BOOKS_FILE))) {
oos.writeObject(books);
oos.close();
System.out.println("Books saved successfully to binary file.");
} catch (IOException e) {
System.out.println("Error saving books: " + e.getMessage());
}
try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(STUDENTS_FILE))) {
oos.writeObject(students);
System.out.println("Students saved successfully to binary file.");
} catch (IOException e) {
System.out.println("Error saving students: " + e.getMessage());
}    
}
public void loadData(){
File fileBooks = new File(BOOKS_FILE);
try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(BOOKS_FILE))) {
books = (ArrayList<Book>) ois.readObject();
System.out.println("Books data loaded from binary file.");
} catch (Exception e) {
System.out.println("Error loading books data.");
}
File fileStudents = new File(STUDENTS_FILE);
if (fileStudents.exists()) {
try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(STUDENTS_FILE))) {
students = (ArrayList<Student>) ois.readObject();
ois.close();
System.out.println("Students data loaded from binary file.");
} catch (Exception e) {
System.out.println("Error loading students data.");
}
}    
}
public void StartSystem(){
Scanner in = new Scanner (System.in);
int choice = 0;
while (choice!=9){
System.out.println("\n--- Library System ---\n"
        + "1. Show books\n"
        + "2. Add A Book\n"
        + "3. Delete A Book\n"
        + "4. Search For A Book\n"
        + "5. Buy A Book\n"
        + "6. Show Students\n"
        + "7. Add A Student\n"
        + "8. Full Report\n"
        + "9. Exit\n"
        + "Enter your CHOICE please!\n"); 
choice = in.nextInt();
switch(choice){
    case 1 : 
        ShowBooks();
        break;
    case 2 :
        AddBook();
        break;
    case 3 :
        DeleteBook();
        break;
    case 4 :
        SearchForA_Book();
        break;
    case 5 :
        BuyBook();
        break;
    case 6 :
        ShowStudent();
        break;
    case 7 :
        AddStudent();
        break;
    case 8 :
        FullReport();
        break;
    case 9:
       System.out.println("Thank you for using the system.\n Goodbye!");
       break;
}
}
}
}
// Sara Qasem Osama Abu Shahla
// 2320253639 
