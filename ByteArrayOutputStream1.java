import java.io.*;

class FileExampleByteArrayOS{
	public static void main(String args[]){
		
		try{
			FileInputStream fin = new FileInputStream("Test.txt");
			FileOutputStream fout = new FileOutputStream("Test.txt");
			ByteArrayInputStream bin = new ByteArrayOutputStream(fin);
			ByteArrayOutputStream bout = new ByteArrayOutputStream(fout);
		}catch(Exception e){}
		
	}
}