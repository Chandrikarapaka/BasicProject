
class Employee
{
float salary;
float bouns;
float  pf;
Employee(float salary,float bouns,float pf)
{ 
this.salary=salary;
this.bouns=bouns;
this. pf=pf;
}
public void show()
{
System.out.println("The Salary of the employee : "+salary);
System.out.println("The bouns of the employee : "+bouns);
System.out.println("The PF of the employee : "+pf);
}	
}
class Total extends Employee
{
float totalsalary=(salary+bouns)-pf;
Total(float salary, float bouns, float pf)
{
super(salary, bouns, pf);
}
public void display()
{
System.out.println("The total salary of the Employee : "+totalsalary);
}
	
}
public class Salary 
{
public static void main(String[] args) {
Total t=new Total(65000,9000,1590);
t.show();
t.display();
}
}
OUTPUT:
The Salary of the employee : 65000.0
The bouns of the employee : 9000.0
The PF of the employee : 1590.0
The total salary of the Employee : 72410.0