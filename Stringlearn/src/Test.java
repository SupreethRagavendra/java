public class Test {

    public static void main(String[] args) {


        String str = "The quick brown fox jumps over the lazy dog";

        for (char i = 'a'; i < 'z'; i++) {
boolean st = false;

            for (int a=0;a<str.length();a++)
            {
                if (i==str.toLowerCase().charAt(a));
                {
                    st = true;
                    break;
                }

            }
            if (st==false)
            {
                System.out.println("not ");
break;
            }
        }
       

            System.out.println("yes");

    }
}
