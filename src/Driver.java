
public class Driver {

	public static void main (String[] args) {
		int databaseId = 612672; //change this to any example numerical ID;
		String encodedURL = URLShortener.encode(databaseId);
		
		System.out.println("The database example ID is: " + databaseId);
		System.out.println("The ID encoded into a URL is: http://mytinyurl.com/" + encodedURL);
		System.out.println("The URL decoded back into an id is: " + URLShortener.decode(encodedURL));
	}
}
