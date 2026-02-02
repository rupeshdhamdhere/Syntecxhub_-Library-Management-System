package Library_Management_System;

public class Book {
	private String title;
	private String author;
	private boolean isAvailable;
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public Book(String title, String author, boolean isAvailable) {
		super();
		this.title = title;
		this.author = author;
		this.isAvailable = isAvailable;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isAvailable=" + isAvailable + "]";
	}
	
	
	
}
