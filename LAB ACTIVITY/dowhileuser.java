import java.util.Scanner;
public class dowhileuser
{
  
 public static void main(String[] args) 

{
  int a, b= 0;
  Scanner s = new Scanner(System.in);
 
    
 do
{
 
 System.out.println("Please enter numbers: ");
 a = s.nextInt();
 b += a;
}

while (a >= 0);   



System.out.println("Total values are = " + b);
   

}

}