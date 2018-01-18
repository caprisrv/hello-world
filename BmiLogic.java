class BmiLogic
{

double height;
double weight;
double BMI;

void setData(double h, double w)
{
height=h;
weight=w;
BMI=(weight/(height*height));
}

void getBMI()
{
System.out.println("BMI is " +BMI);
if (BMI<=18)
{
System.out.println("Under Weight");
}
else if (BMI>18 && BMI<=24)
{
System.out.println("Normal");
}
else if (BMI>24 && BMI<=30)
{
System.out.println("Normal");
}
else
{
System.out.println("Obesity");
}

}

public static void main(String args[])
{
BmiLogic bl=new BmiLogic();
bl.setData(1.75,75);
bl.getBMI();

}
}