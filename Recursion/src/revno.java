public class revno {
    static  int num = 123;
    static  int sum =0;

    public static void main(String[] args) {


        System.out.println(palindrome(num));







    }
    static void rev(int  n,int s)
    {


        if ( n<=0)
        {


            return;
        }
        int rem =  n % 10;
        s = s * 10 + rem;

        rev(n/10,s);




    }

    static  boolean palindrome(int p)

    {
        rev(num,sum);
        boolean s = (num==sum)  ? true: false;
        return s;

    }


}
