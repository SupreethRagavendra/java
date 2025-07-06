public class Twosum {

    public static void main(String[] args) {


        int arr1[] = {2,6,5,8,11};

        int len = arr1.length;
        boolean fg = false;
        int target = 14;

        for (int i = 0; i < len; i++) {
            if (fg==true)
            {
                break;
            }

            for (int j = 0; j < len ; j++) {

                if (j==i)
                {
                    continue;
                }
                if (arr1[i]+ arr1[j]==target)
                {
                    System.out.println("yes");
                    System.out.println("index is " +i+ " " +j);
                    fg = true;

                    break;
                }




            }



        }

        if (fg==false)
        {
            System.out.println("no");
        }
    }
}

