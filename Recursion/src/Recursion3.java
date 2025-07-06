public class Recursion3 {

    public static void main(String[] args) {

        System.out.println(print(1));
    }

    static String print(int n)
    {

        if (n==5)
        {
            return  "1";
        }

        return  n + " " +print(n-1);
    }
}
