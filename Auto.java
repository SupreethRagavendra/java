class Auto
{
public static void main(String[] args)
{
int num =5;
int res = num * num;

System.out.println("square of the number is:"+res);

int ch = res %10;

if (ch==num)
{
System.out.println("yes the number is automorphic");

}
else
{
System.out.println("No the number is automorphic");

}
}
}