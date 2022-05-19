package tryblock;

import java.util.Scanner;

class UserException extends  Exception  

{
	UserException (int a)
	{
		System.out.println("your luggage  having  over weight of"+(a-20)+"KG");
	}

}
	
	
public class Airlinebaggage {
  
	static void disp(int w ) throws  UserException
	{
		if(w>20)
		
		throw new UserException(w);
		
		else
		{
			System.out.println(" PASSED LUGGAGE");
		}
		}
		
		
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" PLEASE ENTER THE LUGGAGE WEIGHT");
	    int  w  =s.nextInt();
	    	
	    {
	    	
	    	try
	    	{
	    		disp(w);
	    	}
	    catch(UserException e)
	    {
	    	System.out.println(w);	
	    }
	    finally
	    {
	    	System.out.println("START YOUR JOURNEY ");
	    }
	    s.close();
	    }
	    
	    
	}

}
