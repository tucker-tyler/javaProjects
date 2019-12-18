//Imports

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class Connection {

	public static void main(String[] args) {
		String output = getUrlContents("https://github.com/tucker-tyler/javaProjects/blob/master/CIT360/Collections/CollectionsTest.java");
				
				System.out.println(output);
	}
	
	private static String getUrlContents(String theUrl) {

			StringBuilder content = new StringBuilder();
			
			try {
				
				URL url = new URL(theUrl);

				URLConnection urlConnection = url.openConnection();
				
				System.out.println("\nSending 'GET' request to URL : " + theUrl + "\n");

				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
				
				String line;

				while((line = bufferedReader.readLine()) != null) {
					content.append(line + "\n");
				}
				bufferedReader.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return content.toString();
	}
}