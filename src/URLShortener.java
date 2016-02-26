//URL encoding and decoding (requires a database with an auto incremented ID)

public class URLShortener {
	private static final String CHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	private static final int LENGTH = CHARS.length();
	
	//Encoding an int ID  using base 62 (from an auto-incremented database such as MYSQL) into a url
	public static String encode (int id) {
		StringBuilder sBuilder = new StringBuilder();
		
		while (id > 0) {
			sBuilder.append(CHARS.charAt(id%LENGTH));
			id /= LENGTH;
		}
		return sBuilder.reverse().toString();
	}

	//Decoding the url into the ID for the database
	public static int decode(String shortURL) {
		int id = 0;
		
		for(int i = 0; i < shortURL.length(); i++) {
			id = id * LENGTH + CHARS.indexOf(shortURL.charAt(i));
		}
		return id;
	}
}