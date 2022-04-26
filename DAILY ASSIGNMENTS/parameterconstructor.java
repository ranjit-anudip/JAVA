class Employee
{
String  ename;
int empid;
Employee(String e,int i)
{
ename =e;
empid =i;
}
void disp()
{
System.out.println(ename+"  "+empid);
}
public static void main(String args[])
{
Employee e1=new Employee(" Employeee",1);
e1.disp();
}
}