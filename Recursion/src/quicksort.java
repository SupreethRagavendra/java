import java.util.Arrays;

public class quicksort {


    public static void main(String[] args) {
        int num[] = {5,3,20,1};
        sort(num,0, num.length-1);
        System.out.println(Arrays.toString(num));

    }

    static  void sort(int num[] , int low , int hi)
    {
        if (low>=hi)
        {
            return;
        }

        int s = low;
        int e = hi;
        int mid = (s+e)/2;
        int pivot =num[mid];

        while (s<=e)
        {
            while (num[s]<pivot)
            {
                s++;
            }
            while (num[e]>pivot)
            {
                e--;
            }
            if (s<=e)
            {
                int temp = num[s];
                num[s]= num[e];
                num[e]=temp;
                s++;
                e--;
            }
        }

        sort(num, low, e);
        sort(num,s,hi);
    }
}
