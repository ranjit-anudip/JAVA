class Rectangle
{
 int L,W;
Rectangle(int length,int width)
{
L=length;
W=width;
}
void disp()
{
System.out.println(L*W);
}
public static void main(String args[])
{
Rectangle R =new Rectangle(40,50);
R.disp();
}
}