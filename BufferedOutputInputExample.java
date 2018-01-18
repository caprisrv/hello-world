import java.io.*;

class BufferedOutputInputExample{
	public static void main(String args[])throws IOException{
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("file2.txt"));
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("file2.txt"));
		bos.write("Hello World!".getBytes());
		bos.write(System.lineSeparator().getBytes());
		bos.write("My self saurabh gupta".getBytes());
		bos.close();
		
		int i;
		while((i=bis.read())!=-1){
			System.out.print((char)i);
		}
		bis.close();
	}
}

