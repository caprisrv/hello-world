class CurrentThreadDemo{

	public static void main(String args[]){
		Thread t = Thread.currentThread();
		System.out.println("Current Thread: "+t);
		
		String name = t.getName();
		System.out.println("Current thread name is: "+name);
		
		t.setName("My Thread");
		System.out.println("After Name Change: "+t);
		
		try{
			System.out.println("In Try");
			for(int n=5;n<5;n--){
				System.out.println("In For");
				System.out.println(n);
				t.sleep(50000);
			}
		}catch(InterruptedException e){
			System.out.println("Main Thread Interrupted");
		}
		
	}

}