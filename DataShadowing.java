class DataShadowing
{

String name;
int age;

void set(String name,int age)
{

this.name=name;
this.age=age;

}

void get()
{

System.out.println(name);
System.out.println(age);

}

public static void main(String args[])
{
DataShadowing ds = new DataShadowing();
ds.set("saurabh",32);
ds.get();

}

}