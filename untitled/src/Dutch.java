import java.util.Arrays;

public class Dutch {

    public static void main(String[] args) {

        int arr[] ={0,0,1,1,0,0,2,2,0,1};


        int n = arr.length;


        int low =0 ;
        int mid =0;
        int high = n-1;


        while (mid<=high)
        {

            if(arr[mid]==0)
            {
                int temp = arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if (arr[mid]==1)
            {
                mid++;
            }
            else if (arr[mid]==2)
            {
               int temp =arr[mid];
               arr[mid] =arr[high];
               arr[high] =temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
