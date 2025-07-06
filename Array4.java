import java.util.*;
class Array4
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


int evenno =0, oddno =0 ,pos=0,neg=0;


for (int j=0;j<n;j++){

if (arr[j] % 2==0){
evenno++;
}
else{
oddno++;
}

if(arr[j]>0)
{
pos++;
}
else if(arr[j]<0)
{
neg++;
}



}


        // Output the results
        System.out.println("Even numbers: " + evenno);
        System.out.println("Odd numbers: " + oddno);
        System.out.println("Positive numbers: " + pos);
        System.out.println("Negative numbers: " + neg);



}}
