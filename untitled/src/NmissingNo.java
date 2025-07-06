public class NmissingNo {


    public static void main(String[] args) {

        int arr1 [] = {1,2,4,5};

        int n = 5;


        for (int i = 1; i < n; i++) {
        boolean flag = false;

            for (int j = 0; j < n-1; j++) {
                if(arr1[j]==i)
                {
                    flag =true;
                    break;
                }

            }

            if (flag==false)

            {
                System.out.println(i);

            }

        }


    }
}
