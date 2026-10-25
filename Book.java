package final_project;
import java.io.Serializable;
public class Book implements Serializable{
// Sara Qasem Osama Abu Shahla
// 2320253639
private int BookID;
private String BookName;
private String BookCategory;
private Author BookAuthor;
private String BookPublisher;
private String BookEditionYear;
private double BookPrice;
private int BookQuantity;
public Book() {
}
public Book(int BookID, String BookName, String BookCategory, Author BookAuthor, String BookPublisher, String BookEditionYear, double BookPrice, int BookQuantity) {
this.BookID = BookID;
this.BookName = BookName;
this.BookCategory = BookCategory;
this.BookAuthor = BookAuthor;
this.BookPublisher = BookPublisher;
this.BookEditionYear = BookEditionYear;
this.BookPrice = BookPrice;
this.BookQuantity = BookQuantity;
}
public void setBookID(int BookID) {
this.BookID = BookID;
}
public void setBookName(String BookName) {
this.BookName = BookName;
}
public void setBookCategory(String BookCategory) {
this.BookCategory = BookCategory;
}
public void setBookAuthor(Author BookAuthor) {
this.BookAuthor = BookAuthor;
}
public void setBookPublisher(String BookPublisher) {
this.BookPublisher = BookPublisher;
}
public void setBookEditionYear(String BookEditionYear) {
this.BookEditionYear = BookEditionYear;
}
public void setBookPrice(double BookPrice) {
this.BookPrice = BookPrice;
}
public void setBookQuantity(int BookQuantity) {
this.BookQuantity = BookQuantity;
}
public int getBookID() {
return BookID;
}
public String getBookName() {
return BookName;
}
public String getBookCategory() {
return BookCategory;
}
public Author getBookAuthor() {
return BookAuthor;
}
public String getBookPublisher() {
return BookPublisher;
}
public String getBookEditionYear() {
return BookEditionYear;
}
public double getBookPrice() {
return BookPrice;
}
public int getBookQuantity() {
return BookQuantity;
}
@Override
public String toString() {
return "Book{" +
        "BookID=" + BookID +
        ", BookName=" + BookName + 
        ", BookCategory=" + BookCategory +
        ", BookAuthor=" + BookAuthor +
        ", BookPublisher=" + BookPublisher +
        ", BookEditionYear=" + BookEditionYear +
        ", BookPrice=" + BookPrice + 
        ", BookQuantity=" + BookQuantity + '}';
}}
// Sara Qasem Osama Abu Shahla
// 2320253639 