public class Maj {

    public static void main(String[] args) {

        int arr[] = {2,2,3,3,1,2,2};


        int n = arr.length;
int ans =0;

        for (int i = 0; i < n; i++) {


            int count =0;

            for (int j = 0; j < n; j++) {

                if (arr[i]==arr[j])
                {
                    count++;
                }

                if (count>n/2)
                {
                   ans = arr[j];
                   break;
                }

            }
            if (ans!=0)
            {
                System.out.println(ans);
                break;
            }

        }
    }
}
