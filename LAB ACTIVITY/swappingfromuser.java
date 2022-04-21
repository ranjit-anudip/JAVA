import java.util.Scanner;

class swappingfromuser
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);


int a,b;

System.out.println(" Enter the first value a : ");
a = s.nextInt();

System.out.println(" Enter the second value b : ");
b=s.nextInt();

System.out.println(" Before The values are ");
System.out.println(" value of first No :"+a);
System.out.println(" value of second No :"+b);


int swapper;

swapper=a;
a=b;
b=swapper;

System.out.println(" After The values are ");
System.out.println(" value of first No:"+a);
System.out.println(" value of second No:"+b);

}
}