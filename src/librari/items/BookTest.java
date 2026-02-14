//package librari.items;
//
//public class BookTest {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//	public static void displayEducationBooks(Book[] books) {
//		for (Book book : books) {
//			if(book!=null && book instanceof EducationBook)
//				System.out.println(book);
//		}
//	}
//	public static void displayFictionBooks(Book[] books) {
//		for (Book book : books) {
//			if(book!=null && book instanceof FictionBook)
//				System.out.println(book);
//		}
//	}
//}
package librari.items;

public class BookTest {
    public static void main(String[] args) {
        Book[] books = BookDataGenerator.generateMixedBooksArray(10);

        System.out.println("=== Education Books ===");
        displayEducationBooks(books);
        System.out.println("\n=== Fiction Books ===");
        displayFictionBooks(books);
    }

    public static void displayEducationBooks(Book[] books) {
        for (Book book : books) {
            if (book instanceof EducationBook)
                System.out.println(book);
        }
    }

    public static void displayFictionBooks(Book[] books) {
        for (Book book : books) {
            if (book instanceof FictionBook)
                System.out.println(book);
        }
    }
}
