import java.util.*;
class Array3
{
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);
System.out.println("enter the size of the array:");
int n = sc.nextInt();
int arr[] = new int[n];

for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int sum =0;
int len = arr.length;
for(int j=0;j<len;j++)
{
sum = sum + arr[j];
}

System.out.println("The total is "+sum);
int avg = sum / len;
System.out.println("The avg  is "+avg);



}}
