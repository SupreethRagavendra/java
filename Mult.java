class Mult
{
public static void main (String[] args)
{

int a = 5;
int b = 2;

int res = 0;

Boolean isneg = false;

if (b<0)
{
b=-b;
isneg = true;
}

for (int i=0;i<b;i++)
{
res =res + a;


}

if (isneg)
{
res = -res;

}

System.out.println("product is "+ res);

}
}
