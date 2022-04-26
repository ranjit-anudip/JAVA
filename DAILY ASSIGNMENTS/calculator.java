import java.util.Scanner;
 class calculator
 {
   
public static void main(String args[]) 
{
      Scanner s = new Scanner(System.in);
      System.out.println("Enter value of 1st number ::");
      int a = s.nextInt();

      System.out.println("Enter value of 2nd number ::");
      int b = s.nextInt();

      System.out.println("Select operation");
      System.out.println("Addition-a: Subtraction-s: Multiplication-m: Division-d:Modulus -M ");
      char operator = s.next().charAt(0);
      switch(operator) 
{
         case 'a' :
         System.out.println("Addition is: "+(a+b));
         break;
         case 's' :
         System.out.println("subtarction is: "+(a-b));
         break;
         case 'm' :
         System.out.println("Multipliction is: "+(a*b));
         break;
         case 'd' :
         System.out.println("Division is: "+(a/b));
         break;
         case 'M' :
         System.out.println("Modulus  is: "+(a%b));         

         break;
         default :
         System.out.println("Invalid choice");
      }
   }
}