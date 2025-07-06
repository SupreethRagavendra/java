public class Sumrec {

    public static void main(String[] args) {

        System.out.println(sum(322 ,0));
    }

    static  int sum(int n,int s)
    {



        if (n==0)
        {
            return 0;
        }


        return sum(n/10,s +n%10);


    }
}
