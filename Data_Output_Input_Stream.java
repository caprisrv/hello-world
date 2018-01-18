import java.io.*;
public class Data_Output_Input_Stream {

   public static void main(String args[])throws IOException {

      // writing string to a file encoded as modified UTF-8
      DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("file.txt"));
      dataOut.writeUTF("Hi! I am saurabh Gupta");
	  dataOut.writeUTF("Hi! I put up in faridabad");
	  dataOut.writeChars("Impetus");
	  dataOut.flush();
	  dataOut.close();
      // Reading data from the same file
      DataInputStream dataIn = new DataInputStream(new FileInputStream("file.txt"));

      while(dataIn.available()>0) {
         char k = dataIn.readChar();
         System.out.print((String)k);
      }
   }
}