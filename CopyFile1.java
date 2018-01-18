import java.io.*;

class CopyFile1{
	public static void main(String args[]){
		int i;
		FileInputStream fin=null;
		FileOutputStream fout=null;
		File yourfile1;
		File yourfile2;
		
		if(args.length!=2){
			System.out.println("Usage: CopyFile From To");
			return;
		}
		
		try{
			yourfile1=new File(args[0]);
			yourfile1.createNewFile();
			fin=new FileInputStream(yourfile1);
			yourfile2=new File(args[1]);
			yourfile2.createNewFile();
			fout=new FileOutputStream(yourfile2);
			
			do{
				i=fin.read();
				if(i != -1)fout.write(i);
			}while(i != -1);
		}catch(IOException e){
			System.out.println("I/O Error: " +e);
		}
		
		finally{
			try{
				if(fin != null)fin.close();
			}catch(IOException e){
			System.out.println("Error Closing Input File");
			}
			try{
				if(fout != null)fout.close();
			}catch(IOException e){
			System.out.println("Error Closing Input File");
			}
		}
	}
}