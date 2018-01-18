import java.io.*;

class FileExample{
	public static void main(String args[]){
		
		try{
		
		FileOutputStream fout = new FileOutputStream("Test.txt");
		FileInputStream fin = new FileInputStream("Test.txt");
		BufferedInputStream bin = new BufferedInputStream(fin);
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		
		bout.write(67);
		bout.write(104);
		bout.write(201);
		bout.write(305);
		
		bout.write('a');
		bout.write('b');
		bout.write('c');
		bout.write('z');

		
		String str = "Hi! I am saurabh gupta";
		byte b[] = str.getBytes();
		
		bout.write(b);
		bout.flush();
		bout.close();
		
		int i;
		
		while((i=bin.read())!=-1){
			System.out.print((char)i);
		}	
		bin.close();
		}catch(Exception e){}
		
	}
}