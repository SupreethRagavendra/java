class StrongNum
{

public static void main(String args[])
{

int num = 145;
int check=num;
int res =1;
int finalres = 0;
int sum =0;

while (num!=0)
{
res = 1;
sum = num % 10;
for(int i=1;i<=sum;i++)
{
res = res * i;


}




finalres = finalres + res;

num = num / 10;



}

System.out.println(finalres);

if (check == finalres)
{


System.out.println("The number is strong number");

}
else
{
System.out.println("The number is not strong number");

}
}
}
