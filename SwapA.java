import java.util.*;
class SwapA
{
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);
System.out.println("enter the size of the array:");
int n = sc.nextInt();
int arr[] = new int[n];
//12 ,10,30

for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}

int len = arr.length;

int last = len-1;

int first =0;
int temp =arr[first];
arr[first]=arr[last];
arr[last]=temp;

System.out.println(Arrays.toString(arr));



}}
