import java.io.*;

class FileExampleFormatted{
	public static void main(String args[]){
		
		try{
		
		FileOutputStream fout = new FileOutputStream("Test.txt");
		PrintWriter pw = new PrintWriter(fout);
		FileReader fr = new FileReader("Test.txt");
		BufferedReader br = new BufferedReader(fr);
		
		pw.println("Hi! I am saurabh Gupta. ");
		pw.print("I put up in faridabad.");
		pw.println();
		pw.print(true);
		pw.println();
		pw.println(false);
		pw.println(Math.PI);
		
		pw.flush();
		pw.close();
		
		String line=null;
		
		while((line=br.readLine())!=null){
			System.out.println(line);
		}	
		br.close();
		}catch(Exception e){}
		
	}
}