package threadpack;

import java.io.Serializable;

public class book implements Serializable {
	
	private int bookid;
	private String title;
	private String author;
	private transient double price=500.50;
	public book(int bookid, String title, String author, double price) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "book [bookid=" + bookid + ", title=" + title + ", author=" + author + ", price=" + price
				+ ", getBookid()=" + getBookid() + ", getTitle()=" + getTitle() + ", getAuthor()=" + getAuthor()
				+ ", getPrice()=" + getPrice() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
