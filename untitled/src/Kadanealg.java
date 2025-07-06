public class Kadanealg {

    public static void main(String[] args) {

       int arr[] = {2, 3, -8, 7, -1, 2, 3};


       int max = arr[1];
int n = arr.length;

        for (int i = 0; i < n ; i++) {


            for (int j = i; j <n ; j++) {
                int sum =0;
                for (int k = i; k <=j ; k++) {
                    sum = sum + arr[k];


                }
                if (sum>max)
                {
                    max = sum;
                }
            }

        }

        System.out.println(max);
    }
}

