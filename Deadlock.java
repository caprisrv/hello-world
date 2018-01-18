class Deadlock{
	public static void main(String args[]){
	
		final String str1 = "Hi";
		final String str2 = "Hello";
	
		Thread t1 = new Thread(){
			public void run(){
				synchronized(str1){
					System.out.println("Thread 1 String 1");
					synchronized(str2){
						System.out.println("Thread 1 String 2");
					}
				}
				
			}
		};
		
		Thread t2 = new Thread(){
			public void run(){
				synchronized(str2){
					System.out.println("Thread 2 String 2");
					synchronized(str1){
						System.out.println("Thread 2 String 1");
					}
				}
				
			}
		};
		
		t1.start();
		t2.start();
	}
}