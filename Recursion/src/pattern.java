public class pattern {


    public static void main(String[] args) {


        //pattern1(4);
//        pattern2(4,0);

        pattern3(3,3);

    }

//    static  void pattern1(int n)
//    {
//
//        for (int i = n; i >0 ; --i) {
//
//            for (int j = 0; j < i; j++) {
//
//                System.out.print("*");
//
//            }
//            System.out.println();
//
//        }
//    }


    static  void pattern2 (int r,int c)
    {
        if(r==0)
        {
            return;
        }

        if(c<r)
        {
            System.out.print("*");
            pattern2(r,c+1);
        }
        else
        {
            System.out.println();
            pattern2(r-1,0);
        }

    }

    static  void pattern3(int r,int c)
    {
        if (r==0)
        {
            return;
        }

        if (c>0)

        {

            System.out.print("*");
            pattern3(r,c-1);
        }
        else {

            System.out.println();
            pattern3(r-1,3);
        }



    }
}
