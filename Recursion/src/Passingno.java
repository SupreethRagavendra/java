public class Passingno {


    public static void main(String[] args) {

        int n = 10;

        fun(n);

    }

    static void fun(int num)
    {
        if (num<=0)
        {
            return;
        }

        System.out.println( num +"");
          fun(--num);
    }
}
