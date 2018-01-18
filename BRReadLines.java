import java.io.*;

class BRReadLines{
	public static void main(String args[]) throws IOException{
		String c;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter lines of text");
		System.out.println("Enter 'stop' to quit");
		
		//read lines
		
		do{
			c=br.readLine();
			System.out.println(c);
		} while(!c.equals("stop"));
	}
}