package MyPack;

public class Balance{

String name;
double bal;

public Balance(String n,double b){
name=n;
bal=b;
}

public void show(){
if(bal<0)
{
	System.out.println("-->");
	System.out.println(name + " : $" + bal);
}
}

}

class AccountBalance{

public static void main(String args[]){

Balance current[] = new Balance[3];

current[0] = new Balance("Saurabh",123.23);
current[1] = new Balance("will tell",157.23);
current[2] = new Balance("Shweta",-12.23);

for(int i=0;i<3;i++){
current[i].show();
}

}

}