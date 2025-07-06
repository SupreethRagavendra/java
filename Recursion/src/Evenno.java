public class Evenno {

    public static void main(String[] args) {

        int num = 10;


      evo(num,0);


    }

    static int evo(int a,int count)
    {

        if (a<0)
        {
            return 0;

        }
        if(a %2==0  && count<=5)
        {
            System.out.print(a + " ");
        }

            return   evo(a-2,count++);






    }
}
