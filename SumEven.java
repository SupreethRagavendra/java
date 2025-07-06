class SumEven
{
public static void main(String[] args)
{

int num = 12345;
int last = 0;
int evensum = 0;
int oddsum =0;

while (num!=0)
{
last = num % 10;

if (last % 2 ==0)
{
evensum =evensum + last;
}
else
{
oddsum = oddsum + last;
}

num = num / 10;
}



System.out.println("odd sum is "+oddsum);
System.out.println("even sum is "+evensum);

}
}