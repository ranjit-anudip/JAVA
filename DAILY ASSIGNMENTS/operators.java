import java.util.Scanner;

class operators
{
public static void main(String args[])
{

Scanner s=new Scanner(System.in);
  

System.out.println(" Enter the first value  : ");
int a = s.nextInt();

System.out.println(" Enter the second value  : ");
int b=s.nextInt();
 
System.out.println(" Enter the second value  : ");
int c=s.nextInt();

int d;
if((a>b) & (a<c) )
{
d=a-b-c;
System.out.println(" THe values are: "+d);
}

else
{

System.out.println("condition failed");
}
}
}