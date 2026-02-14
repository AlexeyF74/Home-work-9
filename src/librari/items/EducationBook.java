//package librari.items;
//
//public class EducationBook extends LibBook {
//	String subject;
//
//	public EducationBook() {
//	}
//
//	public EducationBook(String author, String title, int nPages, int catNumber, String subject) {
//		super(author, title, nPages, catNumber);
//		if (subject != null)
//			this.subject = subject;
//		else
//			this.subject = Messages.getString("EducationBook.0"); //$NON-NLS-1$
//	}
//
//	public String getSubject() {
//		return subject;
//	}
//
//	public void setSubject(String subject) {
//		if (subject != null)
//			this.subject = subject;
//	}
//
//	@Override
//	public String toString() {
//		return Messages.getString("EducationBook.1") + author + Messages.getString("EducationBook.2") + title + Messages.getString("EducationBook.3") + nPages + Messages.getString("EducationBook.4") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
//				+ catNumber + Messages.getString("EducationBook.5") + subject + Messages.getString("EducationBook.6"); //$NON-NLS-1$ //$NON-NLS-2$
//	}
//
//}
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
//			this.genre = Messages.getString("EducationBook.7"); //$NON-NLS-1$
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
//		return Messages.getString("EducationBook.8") + author + Messages.getString("EducationBook.9") + title + Messages.getString("EducationBook.10") + nPages + Messages.getString("EducationBook.11") + catNumber //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
//				+ Messages.getString("EducationBook.12") + genre + Messages.getString("EducationBook.13"); //$NON-NLS-1$ //$NON-NLS-2$
//	}
//
//}
package librari.items;

public class EducationBook extends LibBook {
    private String subject;
    private int gradeLevel;

    public EducationBook(String title, String author, int year, String isbn,
                         String libraryCode, boolean available,
                         String subject, int gradeLevel) {
        super(title, author, year, isbn, libraryCode, available);
        this.subject = subject;
        this.gradeLevel = gradeLevel;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Subject: " + subject +
                           ", Grade Level: " + gradeLevel);
    }

    // Геттеры и сеттеры
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}
