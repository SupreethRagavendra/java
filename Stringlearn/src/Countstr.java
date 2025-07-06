public class Countstr {


    public static void main(String[] args) {

        int count = 0;

        String str = "hello";
        char c = 'e';

        for (int i = 0; i <str.length(); i++) {
            if (str.charAt(i)==c)
            {
                count++;
            }



        }

        System.out.println(count);

    }
}
