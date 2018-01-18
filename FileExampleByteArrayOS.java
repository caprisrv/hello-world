import java.io.*;

class FileExampleByteArrayOS{
	public static void main(String args[]){
		
		try{

			ByteArrayInputStream bin = new ByteArrayInputStream("Hi! I am saurabh gupta.".getBytes());
			
			int d;
			while((d=bin.read())!=-1){
			System.out.print((char)d);
			}	
			
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			bout.write("Hello".getBytes());
			byte b[]=bout.toByteArray();
			System.out.println();
			System.out.println("Print the content");
			for(int x = 0 ; x < b.length; x++){
			// printing the characters
			System.out.print((char)b[x]  + ""); 
			}
			System.out.println("   ");
			
			int c;
			ByteArrayInputStream bin1 = new ByteArrayInputStream(b);
			
			System.out.println("Converting characters to Upper case " );
      
			for(int y = 0 ; y < 1; y++) {
				while(( c = bin1.read())!= -1) {
					System.out.print(Character.toUpperCase((char)c));
					System.out.println();
				}
			}
			
			String str="";
			byte bs[]={65};
			bout.write(bs);
			str=bout.toString();
			
			//print string
			System.out.print(str);
			
			
		}catch(Exception e){}
		
	}
}