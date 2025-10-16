package datastrcture;

import java.util.Arrays;

public class StringTest {
	
	public static void main(String[] args) {
		
		selectQuery("manolo","d");
		
	}
	
	private static String selectQuery(String username, String email) {
		String querySQL =
				"select * from user where username = 'Manolo@gmail.com'";
		querySQL = 
				"select * from user where username = ? and email= ?";
		char[]characters= querySQL.toCharArray();
		
		System.out.println("sub string " + querySQL.subSequence(0, 10));
		
		System.out.println(
				"replace all ? with the value passed through the username variable" +
		querySQL.replace("?", username));
		
		System.out.println(Arrays.toString(characters));
		System.out.println(querySQL.indexOf("?"));
		System.out.println(querySQL.charAt(36));
		
		return "";
		
	}
}

   
