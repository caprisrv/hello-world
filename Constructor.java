class Constructor
{
Constructor(String c)
{
System.out.println("Constructor");
}

public static void main(String args[])
{
System.out.println("Main Method");
Constructor c = new Constructor();
Constructor c1 = new Constructor();
}
}
