//package librari.items;
//
//
//public class LibBook extends Book {
//	
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
//		return Messages.getString("LibBook.0") + author + Messages.getString("LibBook.1") + title + Messages.getString("LibBook.2") + nPages + Messages.getString("LibBook.3") + catNumber    
//				+ Messages.getString("LibBook.4"); 
//	}
//
//}
package librari.items;

public class LibBook extends Book {
    private String libraryCode;
    private boolean available;

    public LibBook(String title, String author, int year, String isbn, String libraryCode, boolean available) {
        super(title, author, year, isbn);
        this.libraryCode = libraryCode;
        this.available = available;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Library Code: " + libraryCode +
                           ", Available: " + available);
    }

    // Геттеры и сеттеры
    public String getLibraryCode() {
        return libraryCode;
    }

    public void setLibraryCode(String libraryCode) {
        this.libraryCode = libraryCode;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
