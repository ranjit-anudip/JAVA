package tryblock;

interface Area
{
 double compute (double length,double breadth);
}

class Rectangle implements Area
{
             public double compute(double length,double breadth)
            {
                         return length*breadth;
            }

}


class Rectangleareinterface
{
  public static void main(String args[])
   {
            Rectangle rectangle=new Rectangle();
            
            Area a;
            a=rectangle;
            System.out.println("Area of Rectangle="  + a.compute(5,20));
            
    }
}