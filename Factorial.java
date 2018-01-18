class Factorial
{

int fact(int n)
{

if(n==1) return 1;

int result=fact(n-1)*n;
System.out.println("fact is "+fact(n-1));
System.out.println("Result is "+result);
return result;

}

}

class Recursion
{

public static void main(String args[])
{

Factorial f = new Factorial();
System.out.println(f.fact(3));

}

}