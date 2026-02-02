package Library_Management_System;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books = new ArrayList<>();
	public void addBook(String title , String author)
	{
		Book newbook =new Book(title , author , true);
		books.add(newbook);
		System.out.println("Book Added Sucessfully");
		
	}
	
	public void displayBook()
	{
		if(books.isEmpty())
		{
			System.out.println("Books not available in library");
		}
		else
		{
			System.out.println("Available books in the Library");
			for(Book book:books)
			{
				System.out.println(book);
			}
		}
	}
	public void borrowbook(String title)
	{
		for(Book book:books)
		{
			if(book.getTitle().equalsIgnoreCase(title))
			{
				if(book.isAvailable())
				{
					book.setAvailable(false);
					System.out.println("You have successfully borrowed " + book.getTitle());
				}
				else
				{
					System.out.println("Soory the book is currently borrows by someone");
				}
				return;
				
			}
					
			}
		System.out.println("Book not found in the lab");
	}
	
	public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Book borrowed successfully");
                } else {
                    System.out.println("Book already borrowed");
                }
                return;
            }
        }
        System.out.println("Book not found");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println("Book returned successfully");
                } else {
                    System.out.println("Book was not borrowed");
                }
                return;
            }
        }
        System.out.println("Book not found");
    }
	
	

}
