class Employee
{
int empid;
String  ename;
double sal;
Employee(int i,String s)
{
empid =i;
ename =s;
}
Employee(int i,String s, double s1)
{
empid =i;
ename =s;
sal=s1;
}

void disp ()
{
System.out.println(empid+"  "+ename+""+sal);
}
public static void main(String args[])
{
Employee emp= new Employee(" Employeee",1);

Employee emp1= new Employee(" Employeee",1,35000);
emp.disp();
emp1.disp();
}
}