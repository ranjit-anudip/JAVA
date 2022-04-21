import java.util.Scanner;

class arithmeticjavafromuser
{
public static void main(String args[])
{

Scanner s=new Scanner(System.in);
 
int a, b; 

System.out.println(" Enter the first value a : ");
a = s.nextInt();

System.out.println(" Enter the second value b : ");
b=s.nextInt();
 
System.out.println(" Addition is="+(a+b));
System.out.println(" substraction is ="+(a-b));
System.out.println(" Multiplication is= "+(a*b));
System.out.println(" Division is= "+(a/b));
System.out.println(" Modulus is= "+(a%b));

}
}