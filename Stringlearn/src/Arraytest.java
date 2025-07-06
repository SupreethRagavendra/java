import java.util.Arrays;

public class Arraytest {


    public static void main(String[] args) {


        int arr[] = {8, 2, 3, 12, 16};


        int temp[] = new int[arr.length];

        int n = arr.length;


        // finding factors

        for (int i = 0; i <n ; i++) {
            int count =0;

            for (int j = 1; j <arr[i] ; j++) {

                if (arr[i] % j==0)
                {
                count++;
                }
                temp[i]=count;

            }

        }

        for (int i = 0; i < n; i++) {

            for (int j = i+1; j < n; j++) {


                if (temp[i]<temp[j])
                {

                    int t = temp[i];
                    temp[i]=temp[j];
                    temp[j]= t;


                    int t2 = arr[i];
                    arr[i]=arr[j];
                    arr[j]= t2;
                }

            }

        }

        for (int i = 0; i < n ; i++) {

            System.out.print(arr[i]);


        }
        

    }
}
