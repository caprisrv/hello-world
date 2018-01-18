class Average
{
public static void main(String args[])
{

double num[]={10.1,34.67,45.789,123.423,789.109};
double result=0;
double average;

for(int i=0;i<5;i++)
{
result=result+num[i];
}
average=result/5;

System.out.println("Average is "+average);

}

}
