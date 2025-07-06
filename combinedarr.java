import java.util.Arrays;

class combinedarr
{
public static void main(String[] args)
{
int arr1[] = {1,2,3};

int arr2[] = {4,5,6};

int len1 = arr1.length;
int len2 =arr2.length;

int combinedarr[] = new int[len1+len2];

for (int i=0;i<len1;i++)
{

combinedarr[i]=arr1[i];

}

for (int i=0; i<len2;i++)
{
combinedarr[len2+i]=arr2[i];

}

System.out.println("arrays is " +Arrays.toString(combinedarr));


}
}import java.util.Arrays;

class EvenNo
{
public static void main(String[] args)
{
int arr1[] = {1,2,3};

int arr2[] = {4,5,6};

int len1 = arr1.length;
int len2 =arr2.length;

int combinedarr[] = new int[len1+len2];

for (int i=0;i<len1;i++)
{

combinedarr[i]=arr1[i];

}

for (int i=0; i<len2;i++)
{
combinedarr[len2+i]=arr2[i];

}

System.out.println("arrays is " +Arrays.toString(combinedarr));


}
}