//package librari.items;
//
//public class Book {
//	String author;
//	String title;
//	int nPages;
//
//	public Book() {
//	}
//
//	public Book(String author, String title, int nPages) {
//		if (author != null)
//			this.author = author;
//		else
//			this.author = "No author";
//		if (title != null)
//			this.title = title;
//		else
//			this.title = "No title";
//		setnPages(nPages);
//	}
//
//	public String getAuthor() {
//		return author;
//	}
//
//	public void setAuthor(String author) {
//		if (author != null)
//			this.author = author;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		if (title != null)
//			this.title = title;
//	}
//
//	public int getnPages() {
//		return nPages;
//	}
//
//	public void setnPages(int nPages) {
//		if (nPages > 0)
//			this.nPages = nPages;
//	}
//
//	@Override
//	public String toString() {
//		return "Book [author=" + author + ", title=" + title + ", nPages=" + nPages + "]";
//	}
//
//}
//public class LibBook extends Book {
//	int catNumber;
//
//	public LibBook() {
//	}
//
//	public LibBook(String author, String title, int nPages, int catNumber) {
//		super(author, title, nPages);
//		setCatNumber(catNumber);
//	}
//
//	public int getCatNumber() {
//		return catNumber;
//	}
//
//	public void setCatNumber(int catNumber) {
//		if (catNumber > 99_999 && catNumber < 1_000_000)
//			this.catNumber = catNumber;
//	}
//
//	@Override
//	public String toString() {
//		return "LibBook [author=" + author + ", title=" + title + ", nPages=" + nPages + ", catNumber=" + catNumber
//				+ "]";
//	}
//
//}
package librari.items;

public class Book {
    private String title;
    private String author;
    private int year;
    private String isbn;

    public Book(String title, String author, int year, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
    }

    public void display() {
        System.out.println("Title: " + title +
                           ", Author: " + author +
                           ", Year: " + year +
                           ", ISBN: " + isbn);
    }

    // Геттеры и сеттеры
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
