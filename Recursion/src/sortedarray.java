public class sortedarray {

    static  int count =0;

    public static void main(String[] args) {

        int arr[] = {9,2,3,5};

        System.out.println(sorted(arr,0));

        System.out.println( count);
    }

    static  boolean sorted(int arr[] ,int index)
    {
++count;

        if (index== arr.length-1)
        {
            return  true;
        }

        return  arr[index]<arr[index+1] && sorted(arr,index+1);


    }
}
