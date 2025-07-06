import java.util.Arrays;

public class Rearray {

    public static void main(String[] args) {

        int arr[] = {3,1,-2,-5,2,-4};

        int n = arr.length;

        int pos[] = new int[n/2];
        int neg[] = new int[n/2];

        int p = 0, q = 0; // Separate counters for pos and neg


        for (int i = 0; i < n; i++) {

            if(arr[i]>0)
            {
             pos[p++]=arr[i];
            }


            else if (arr[i]<0)
            {
                neg[q++]=arr[i];

            }



        }

        for (int i = 0; i < n/2; i++) {
            arr[2*i]=pos[i];
            arr[2*i+1]=neg[i];

        }

        System.out.println(Arrays.toString(arr));
    }
}
