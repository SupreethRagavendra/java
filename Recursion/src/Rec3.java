public class Rec3 {

//    5! - > 1 *2 *3 * 4 * 5


    public static int  fic(int n)
    {

        if(n==1 || n==0)
        {
            return  n;
        }

        return  fic(n-1) *n;
    }

    public static void main(String[] args) {
        System.out.println(fic(5));


    }




}
