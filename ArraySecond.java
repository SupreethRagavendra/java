class ArraySecond
{
public static void main(String[] args)
{

int arr[] = {10,30,10,40};


int largest = arr[0];
int second = -1;

for (int i=1;i<arr.length;i++)
{
if(arr[i]>largest)
{
second = largest;
largest = arr[i];
}
else if (arr[i]<largest && arr[i]>second)
{
second =arr[i];
}
}

System.out.println(second);
}
}