import java.sql.Array;
import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {


        int arr[] ={0,0,1,1,0,0,2,2,0,1};
        int n = arr.length;

        int count0 =0;
        int count1=0,count2=0 ;

        for (int i = 0; i < n; i++) {

            if (arr[i]==0)
            {
                count0++;

            }
            if (arr[i]==1)
            {
                count1++;
            }
            if (arr[i]==2)
            {
                 count2++;
            }

        }

        int index = 0;

        for (int i = 0; i <count0; i++) {
            arr[index++]=0;
        }

        for (int i = 0; i <count1; i++) {
            arr[index++]=1;
        }

        for (int i = 0; i <count2; i++) {
            arr[index++]=2;
        }

        System.out.println(Arrays.toString(arr));

    }
}
