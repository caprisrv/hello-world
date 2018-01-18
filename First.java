class First
{
	int i=10;
	static int j=20;

	void count()
{		
	int k=30;
	i++;
	j++;
	System.out.println(i+"   "+j);
	System.out.println(k);
}

	
	public static void main (String args[])
{
	First f = new First();
	First f1 = new First();
	First f2 = new First();
	
	f.count();
	f1.count();
	f2.count();
}
}