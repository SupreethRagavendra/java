import java.util.Arrays;

import static java.io.ObjectInputFilter.merge;

public class Mergesort {

    public static void main(String[] args) {

        int arr[] = {10,40,20,30,50,9};
arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static  int [] mergesort(int arr[] )
    {
        if (arr.length==1)
        {
            return  arr;
        }

        int mid = arr.length/2;

        int [] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int [] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return  merge(left,right);

    }

    private static int[] merge(int[] left, int[] right) {

        int[] max = new int[left.length + right.length];
        int i = 0 ;
        int j = 0;
        int k =0;

        while (i<left.length && j<right.length)
        {
            if (left[i]<right[j])
            {
                max[k]=left[i];
                i++;

            }
            else
            {
                max[k]=right[j];
                j++;


            }
            k++;
        }

        while (i<left.length)
        {
            max[k]=left[i];
            i++;
            k++;

        }

        while (j<right.length)
        {
            max[k]=right[j];
            j++;
            k++;

        }

        return  max;
    }
}
