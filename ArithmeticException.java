class ArithmeticException{
	public static void main(String args[]){
	try{
		System.out.println("HI");
		int a=10;
		int b=a/0;
		}catch(Exception e){e.printStackTrace();}
		finally{
			System.out.println("In Final");
		}
		System.out.println("BYE");
		
	}
}