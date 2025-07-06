public class Kadanealg2 {
    public static void main(String[] args) {


        int arr[] = {2, 3, -8, 7, -1, 2, 3};


        int max = arr[0];
        int n = arr.length;
        int sum =0;
        int startin =-1;
        int endindex =-1;

        for (int i = 0; i < n; i++) {


            if(sum==0)
            {
                startin = i;
            }
            sum +=arr[i];

            if (sum>max)
            {
              max = sum  ;
              endindex =i;
            }
            if (sum<0)
            {
                sum =0;
            }

        }

   for (int i=startin;i<=endindex;i++)
   {
       System.out.print(" " + arr[i] + " ") ;
   }

        System.out.println("\n" + max);

    }
}
