import java.util.Scanner;
class voting
{

public static void main(String args[])

{

Scanner s=new Scanner (System.in);

System.out.println("Enter the age:");

int a = s.nextInt();



if(a>18)

{

System.out.println("You are eligible to Vote");

}

else{

System.out.println("You are not eligible to vote");

}

}

}