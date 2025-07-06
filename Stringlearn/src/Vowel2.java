public class Vowel2 {

    public static void main(String[] args) {

        String str = "hello world";
        String res = "";

        int n = str.length();

        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);


            if (c!='a' && c!='e' && c!='o' && c!='u'  && c!='i')
            {
             res+=c;
            }
            else
            {
                res+="*";
            }

        }

        System.out.println(res);
    }
}
