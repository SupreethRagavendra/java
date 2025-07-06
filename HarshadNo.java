class HarshadNo
{

public static void main(String[] args)
{
int num =12;
int last;
int sum =0;
while (num!=0)
{
last = num % 10;
 sum = sum + last;
num = num / 10;
}

if(num % sum ==0)
{
System.out.println("yes it is a harshad  number");
}
else
{

System.out.println("No it is a harshad number");
}
}

}