import java.util.Scanner;

public class palindromeuser

{
 public static void main(String[] args)

{

Scanner s = new Scanner(System.in);

System.out.print(" Enter the three digit values : ");

 int a = s.nextInt();

int b,c=0,temp;

temp = a;

 while(temp > 0)

{

 b = temp % 10;

c= (c * 10) + b;

 temp = temp/10;


}

if(c == a) 

{

System.out.println(a+" IS A PALINDROME NUMBER");


 }

else


{

System.out.println(a+" IS A NOT PALINDROME NUMBER");

}

}

}