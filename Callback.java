interface Callback{

void callback(int param);

}

class Client implements Callback{

public void callback(int param){

System.out.println("Callback called with "+param);

}

void nonIfaceMeth(){

System.out.println("Classes that implements interfaces " + "may also define other members, too.");

}

}

class AnotherClient implements Callback{

public void callback(int param){

System.out.println("Another version of callback ");
System.out.println("param squared is  "+(param*param));

}


}

class TestIface{

public static void main(String args[]){

Callback c = new Client();
c.callback(42);

}

}

class TestIface2{

public static void main(String args[]){

Callback c = new Client();
Callback d = new AnotherClient();
AnotherClient ob = new AnotherClient();

c.callback(42);
d.callback(42);
c=ob;
c.callback(42);

}

}

