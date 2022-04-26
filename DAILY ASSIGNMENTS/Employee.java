class Employee
{
int empid;
String  ename;
int sal;
Employee(int e,String s)
{
empid =e;
ename =s;
}
Employee(int e,String s, int s1)
{
empid =e;
ename =s;
sal=s1;
}
void disp ()
{
System.out.println(empid+"  "+ename+" "+sal);
}
public static void main(String args[])
{
Employee emp=new Employee(1," Hari ");

Employee emp1=new Employee(2," Harish ",35000);
emp.disp();
emp1.disp();
}
}