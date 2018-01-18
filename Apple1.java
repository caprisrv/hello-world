enum Apple1{
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo1{
	
	public static void main(String args[]){
		Apple1 ap;
		
		System.out.println("Here are all Apple Constants: ");
		
		//Apple1 allapples[] = Apple1.values();
		
		for(Apple1 a : Apple1.values()){
			System.out.println(a);
		}
		
		ap = Apple1.valueOf("Winesap");
		System.out.println();
		System.out.println("ap contains : "+ap);
	}
}