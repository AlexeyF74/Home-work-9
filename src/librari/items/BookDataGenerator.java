package librari.items;
//
//public class BookDataGenerator {
//	private static final String[] GENRES = { "Fantasy", "Sci-Fi", "Mystery", "Adventure", "Romance" };
//	private static final String[] SUBJECTS = { "Math", "Physics", "History", "Biology", "Computer Science" };
//	private static final Random random = new Random();
//	
//	private static int getRandomInt(int min, int max) {
//		return random.nextInt(min, max+1);//random.nextInt(max-min+1)+min;
//	}
//	private static String generateRandomString(String prefix, int range) {
//		return prefix+"_"+getRandomInt(1, range);
//	}
//	public static Book[] generateMixedBooksArray(int size) {
//		Book[] books = new Book[size];
//		for (int i = 0; i < books.length; i++) {
//			int type=random.nextInt(2);//0 Fiction 1 Education
//			if(type==0)
//				books[i]=generateRandomFictionBook();
//			else
//				books[i]=generateRandomEducationBook();
//		}
//		return books;
//	}
//private static Book generateRandomEducationBook() {
//		String author = generateRandomString("Author",100);
//		String title = generateRandomString("Title", 400);
//		int nPages = getRandomInt(50, 2000);
//		int catNumber = getRandomInt(10_000, 99_999);
//		String subject = getRandom(SUBJECTS);
//		
//		return new EducationBook(author, title, nPages, catNumber, subject);
//	}
//	private static Book generateRandomFictionBook() {
//		String author = generateRandomString("Author",100);
//		String title = generateRandomString("Title", 400);
//		int nPages = getRandomInt(50, 2000);
//		int catNumber = getRandomInt(10_000, 99_999);
//		String genre = getRandom(GENRES);
//		
//		return new FictionBook(author, title, nPages, catNumber, genre);
//	}
//	private static String getRandom(String[] arr) {
//		
//		return arr[random.nextInt(arr.length)];
//	}
//}
//package librari.data;

//public class BookDataGenerator {
//
//    public static Book[] generateBooks() {
//        Book[] books = new Book[6];
//
//        books[0] = new EducationBook("Math for 7th Grade", "Dr. Smith", 2018, "ISBN1234", "LIB001", true, "Mathematics", 7);
//        books[1] = new EducationBook("History of Europe", "J. Brown", 2020, "ISBN5678", "LIB002", true, "History", 10);
//        books[2] = new FictionBook("The Hobbit", "J.R.R. Tolkien", 1937, "ISBN0001", "LIB003", false, "Fantasy");
//        books[3] = new FictionBook("1984", "George Orwell", 1949, "ISBN0002", "LIB004", true, "Dystopian");
//        books[4] = new LibBook("Chemistry Basics", "Dr. Green", 2015, "ISBN9999", "LIB005", true);
//        books[5] = new LibBook("Art through Ages", "L. Gray", 2012, "ISBN8888", "LIB006", false);
//
//        return books;
//    }
//
//	public static Book[] generateMixedBooksArray(int i) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}

//package librari.items;
//
//public class BookDataGenerator {
//    public static void main(String[] args) {
//        Book[] books = BookDataGenerator.generateBooks(); // ← обязательно вызвать метод
//
//        displayAllBooks(books);
//        displayEducationBooks(books);
//        displayFictionBooks(books);
//    }
//
//    private static Book[] generateBooks() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public static void displayAllBooks(Book[] books) {
//        System.out.println("=== All Books ===");
//        for (Book book : books) {
//            if (book != null) {
//                book.display();
//                System.out.println();
//            }
//        }
//    }
//
//    public static void displayEducationBooks(Book[] books) {
//        System.out.println("=== Education Books ===");
//        for (Book book : books) {
//            if (book instanceof EducationBook) {
//                book.display();
//                System.out.println();
//            }
//        }
//    }
//
//    public static void displayFictionBooks(Book[] books) {
//        System.out.println("=== Fiction Books ===");
//        for (Book book : books) {
//            if (book instanceof FictionBook) {
//                book.display();
//                System.out.println();
//            }
//        }
//    }
//}

public class BookDataGenerator {

    public static void main(String[] args) {
        Book[] books = generateBooks(); // ← ОБЯЗАТЕЛЬНО вызвать метод

        displayAllBooks(books);        // ← передаём НЕ null
        displayEducationBooks(books);
        displayFictionBooks(books);
    }

    public static Book[] generateBooks() {
        return new Book[]{
            new EducationBook("Math", "Newton", 2010, "School", null, false, null, 0),
            new FictionBook("Dune", "Herbert", 1980, "Sci-Fi", null, false, null),
            new EducationBook("Physics", "Einstein", 2015, "University", null, false, null, 0),
            new FictionBook("1984", "Orwell", 1949, "Dystopia", null, false, null),
            null
        };
    }

    public static void displayAllBooks(Book[] books) {
        System.out.println("=== All Books ===");
        if (books == null) {
            System.err.println("Error: books array is null.");
            return;
        }

        for (Book book : books) {
            if (book != null) {
                book.display();
                System.out.println();
            }
        }
    }

    public static void displayEducationBooks(Book[] books) {
        System.out.println("=== Education Books ===");
        if (books == null) return;
        for (Book book : books) {
            if (book instanceof EducationBook) {
                book.display();
                System.out.println();
            }
        }
    }

    public static void displayFictionBooks(Book[] books) {
        System.out.println("=== Fiction Books ===");
        if (books == null) return;
        for (Book book : books) {
            if (book instanceof FictionBook) {
                book.display();
                System.out.println();
            }
        }
    }

	public static Book[] generateMixedBooksArray(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
