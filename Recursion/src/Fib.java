
public class Fib {


    public static void main(String[] args) {
int ans =Fib(80);
        System.out.println(ans);
    }

    static  int   Fib(int n)
    {

        if (n==0)
        {
            return  n;
        } else if (n==1) {
            return  n;

        }

        return  Fib(n-1)+ Fib(n-2);

    }
}
