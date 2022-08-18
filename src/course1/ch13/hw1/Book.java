package course1.ch13.hw1;


public class Book {
	Author author;
	String title;
	int page;
	BookType bookType;
	boolean isHardCover;
	int currentPage;

	Reader reader;
	

	public Book(Author author, String title, int page, BookType bookType, boolean isHardCover, int currentPage) {
		this.author = author;
		this.title = title;
		this.page = page;
		this.bookType = bookType;
		this.isHardCover = isHardCover;
		this.currentPage = currentPage;

	}

	public Book(Author author, String title, int page, BookType bookType, boolean isHardCover, int currentPage,
			Reader reader) {
		this.author = author;
		this.title = title;
		this.page = page;
		this.bookType = bookType;
		this.isHardCover = isHardCover;
		this.currentPage = currentPage;

	}
	public Book() {
		
	}
	
	
	public void setReader(Reader reader) {
		this.reader = reader;
	}

	public Reader getReader() {
		return reader;
	}

	public BookType getBookType() {
		return bookType;
	}

	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}
	
	
}
