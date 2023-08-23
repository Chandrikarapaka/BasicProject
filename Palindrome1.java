//10.Write a Program to Check Given Number is a Palindrome or Not

class Palindrome1
{
public static void main(String arc[])
{
int rem,c=0,n=12,v=n;
while(n!=0)
{
rem=n%10;
c=c*10+rem;
n=n/10;
}
if(v==c)
{
System.out.println("given number is Palindrome number");
}
else 
{
System.out.println("Given is not palindrome");
}

}

}

