public class Max_Consecutive1 {

    public static void main(String[] args) {

        int arr1[] = {1,1,0,1,1,1,1,0,1,1};

        int len = arr1.length;

        int count =0;
        int max =0;

        for (int i = 0; i < len; i++) {

            if (arr1[i]==1)
            {
                count++;
                if (count>max)
                {
                    max=count;
                }


            }
            else {
                count=0;

            }



        }
        System.out.println(max);
    }
}
