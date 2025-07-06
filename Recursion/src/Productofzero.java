public class Productofzero {

    public static void main(String[] args) {

        int n = 22;
        System.out.println(products(n));
    }


    static int products(int num)

    {

        if (num %10==num)
        {
            return num;
        }
        return ((num%10)* products(num/10) );

    }
}
