public class test4 {

    public static void main(String[] args) {

        String str = "hello world is java";

     int count = 1;

        int n = str.length();

        for (int i = 0; i <n ; i++) {
            char c = str.charAt(i);
            if (c==' ')
            {
                count++;
            }



        }

        System.out.println(count);
    }
}
