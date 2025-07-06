public class lengthstr {


    public static void main(String[] args) {
String str = "hello";

int count =0;

        for (int i = 0; ; i++) {

            try {
                char ch = str.charAt(i);
                count++;
            }
            catch (Exception e)
            {
                break;
            }

        }
        System.out.println(count);
    }
}
