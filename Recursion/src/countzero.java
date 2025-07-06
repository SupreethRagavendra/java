public class countzero {


    public static void main(String[] args) {


        System.out.println(count(120030));
    }

    static  int count(int n)
    {
        return  helper(n,0);
    }

    static  int helper(int num,int c)
    {
        if (num<=0)
        {
            return c;
        }
        int rem  = num %10;
        if (rem==0)
        {
            return  helper(num/10,++c);
        }


else
        {
            return c;
        }
    }
}
