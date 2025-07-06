public class pattern1 {

    private static void pattern1() {
        // Square pattern of stars (4x4)
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern2() {
        // Increasing triangle pattern
        for (int i = 0; i <= 4; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern3() {
        // Number triangle pattern
        int n = 5;
        for (int i = 0; i < n; i++) {
            int a = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(a++);
            }
            System.out.println();
        }
    }

    private static void pattern4() {
        // Inverted triangle pattern
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern5() {
        // Inverted pyramid pattern
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void pattern6() {
        // Pyramid pattern
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    private static void pattern7() {
        // Diamond  pattern
        int n = 3;

        for (int i = 1; i <=2*n-1 ; i++) {

            int star = i;

            if (i >n)
            {
                star = 2 * n-i;
            }
            for (int j = 1; j <=star ; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }


    private static void pattern9()
    {
        int b =1;
        for (int i = 0; i <5 ; i++) {




            if ( i % 2 ==0)
            {
                b =1;
            }

            else
            {
                b=0;
            }
            for (int j = 0; j <=i; j++) {


                    System.out.print(b);
            b= 1- b;



            }
            System.out.println();

        }
    }


    private  static  void  pattern10()
    {
int n =4;
        int space = 2*(n-1) ;
        for (int i = 1; i <=n; i++) {


            for (int j = 1; j <=i ; j++) {
                System.out.print(j);

            }

            for (int j = 1; j <=space; j++) {
                System.out.print(" ");

            }

            for (int j = i; j >=1 ; j--) {
                System.out.print(j);

            }
            System.out.println();
            space-=2;

        }


    }
    public static void main(String[] args) {
//        pattern1();
//        System.out.println();
//
//        pattern2();
//        System.out.println();
//
//        pattern3();
//        System.out.println();

//        pattern4();
//        System.out.println();



//        pattern6();
       pattern10();
    }
}
