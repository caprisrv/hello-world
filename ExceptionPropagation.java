import java.io.*;

class ExceptionPropagation{
	
	void a() throws IOException{
	//try{
		b();
	//}catch(Exception e){}
	}
	
	void b() throws IOException{
	c();
	}
	
	void c() throws IOException{
		//try{
			//int x=100/0;
			throw new IOException();
		//}catch(Throwable e){System.out.println("in catch");}
	}
	
	public static void main(String args[]) throws IOException{
	
		System.out.println("Hi");
		
		ExceptionPropagation ep = new ExceptionPropagation();
		try{
		ep.a();
		}catch(Exception e){e.printStackTrace();}
		
		System.out.println("Bye");
		
	}
}