//package librari.items;
//
//public class FictionBook extends LibBook {
//	String genre;
//
//	public FictionBook() {
//	}
//
//	public FictionBook(String author, String title, int nPages, int catNumber, String genre) {
//		super(author, title, nPages, catNumber);
//		if (genre != null)
//			this.genre = genre;
//		else
//			this.genre = "No genre";
//	}
//
//	public String getGenre() {
//		return genre;
//	}
//
//	public void setGenre(String genre) {
//		if (genre != null)
//			this.genre = genre;
//	}
//
//	@Override
//	public String toString() {
//		return "FictionBook [author=" + author + ", title=" + title + ", nPages=" + nPages + ", catNumber=" + catNumber
//				+ ", genre=" + genre + "]";
//	}
//
//}
//package librari.items;
//
//public class FictionBook extends LibBook {
//    String genre;
//
//    public FictionBook() {}
//
//    public FictionBook(String author, String title, int nPages, int catNumber, String genre) {
//        super(author, title, nPages, catNumber);
//        if (genre != null)
//            this.genre = genre;
//        else
//            this.genre = Messages.getString("EducationBook.7"); // или "No genre"
//    }
//
//    public String getGenre() {
//        return genre;
//    }
//
//    public void setGenre(String genre) {
//        if (genre != null)
//            this.genre = genre;
//    }
//
//    @Override
//    public String toString() {
//        return Messages.getString("EducationBook.8") + author + 
//               Messages.getString("EducationBook.9") + title + 
//               Messages.getString("EducationBook.10") + nPages + 
//               Messages.getString("EducationBook.11") + catNumber + 
//               Messages.getString("EducationBook.12") + genre + 
//               Messages.getString("EducationBook.13");
//    }
//}
package librari.items;

public class FictionBook extends LibBook {
    private String genre;

    public FictionBook(String title, String author, int year, String isbn,
                       String libraryCode, boolean available,
                       String genre) {
        super(title, author, year, isbn, libraryCode, available);
        this.genre = genre;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Genre: " + genre);
    }

    // Геттеры и сеттеры
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

