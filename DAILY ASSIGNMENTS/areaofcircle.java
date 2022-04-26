import java.util.Scanner;

class areaofcircle
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println(" Enter the  radius value: ");
double r =s.nextDouble();
double area= 3.14*r*r;
System.out.println("The Area of circle  is: " + area);
}
}