import java.util.Arrays;

public class test3 {

    public static void main(String[] args) {

        int arr[]={0,1,2,0,1,2};

        int num[] = new int[arr.length];


        int count0=0;
        int count1=0;
        int count2 =0;

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if (arr[i]==0)
            {
                count0++;
            } else if (arr[i]==1) {
                count1++;

            } else if (arr[i]==2) {
                count2++;

            }

        }
        int k=0;
        for (int i = 0; i < count0; i++) {
            num[i]=0;
            k++;

        }
        for (int i = k; i < count0+count1; i++) {
            num[i]=1;
            k++;

        }

        for (int i = k; i < count0+count1+count2; i++) {
          num[i]=2;
          k++;
        }


        System.out.println(Arrays.toString(num));


    }
}
