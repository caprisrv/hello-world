enum Apple{
	Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo{
	
	public static void main(String args[]){
		Apple ap;
		
		ap = Apple.RedDel;
		System.out.println("Value of ap: " +ap);
		System.out.println();
		
		ap = Apple.GoldenDel;
		
		if(ap == Apple.GoldenDel){
			System.out.println("ap contains GoldenDel. \n");
		}
		
		switch(ap){
			case Jonathan:
			System.out.println("Jonathan is red");
			break;
			
			case GoldenDel:
			System.out.println("GoldenDel is yellow");
			break;
			
			case RedDel:
			System.out.println("RedDel is Red");
			break;
			
			case Winesap:
			System.out.println("Winesap is Red");
			break;
			
			case Cortland:
			System.out.println("Cortland is Red");
			break;
		}
	}
}