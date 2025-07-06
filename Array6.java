import java.util.*;
class Array6
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

int len = arr.length;

int minindex = 0;
int maxindex =0;

for (int j=1;j<len;j++)
{
if (arr[j]>arr[maxindex])
{
maxindex = j;
}
if(arr[j]<arr[minindex])
{
minindex=j;
}

}

System.out.println("The maxindex is"+maxindex);
System.out.println("The minindex no is"+minindex);





}}
