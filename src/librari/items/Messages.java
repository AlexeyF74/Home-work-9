package librari.items;
//
//import java.util.MissingResourceException;
//import java.util.ResourceBundle;
//
//public class Messages {
//	private static final String BUNDLE_NAME = Messages.class.getPackageName() + ".messages"; //$NON-NLS-1$
//
//	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);
//
//	private Messages() {
//	}
//
//	public static String getString(String key) {
//		try {
//			return RESOURCE_BUNDLE.getString(key);
//		} catch (MissingResourceException e) {
//			return '!' + key + '!';
//		}
//	}
//}
//package librari.util;

public class Messages {
    public static void printHeader(String title) {
        System.out.println("\n=== " + title + " ===");
    }

    public static void printSeparator() {
        System.out.println("------------------------------");
    }

    public static void printError(String message) {
        System.err.println("Error: " + message);
    }
}
