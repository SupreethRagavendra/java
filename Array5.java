import java.util.*;
class Array5
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

int largestno = arr[0];
int smallestno =arr[0];

for (int j=0;j<len;j++)
{
if (arr[j]>largestno)
{
largestno=arr[j];
}
if(arr[j]<smallestno)
{
smallestno = arr[j];
}

}

System.out.println("The smallest no is"+smallestno);
System.out.println("The Largest no is"+largestno);





}}
