package tryblock;
import java.util.Scanner;
public class Largestelementinarray {

	public static void main(String[] args) {
		{

		int l,i,max;

		Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        
        l=s.nextInt();
        int a[]=new int[l];
        System.out.println("Enter the elements:");

		
        for(i=0;i<l;i++)
        {
         a[i]=s.nextInt();
         }
		max=a[0];

		
		
		for(i=0;i<l;i++)
		{
        if(a[i]>max)
        {

		max=a[i];

		}
        }

		System.out.println("Maximum element in the array: "+max);

		}

	}
}


