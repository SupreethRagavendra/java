public class test3 {

    public static void main(String[] args) {


        System.out.println(reverseWords("the sky is blue"));



    }

    public static String reverseWords(String s) {



        int n = s.length();
String rev = " ";
        for (int i = n-1; i >=0; i--) {

            rev = rev + s.charAt(i);


            
        }

String ss = " ";

String ans = "";
        for (int i = 0; i < n; i++) {

            while (rev.charAt(i)!=' ' && i<n)
            {

                ss=ss+rev.charAt(i);
                i++;

            }

            if (rev.length()>0)
            {
                ans += ss;

            }
        }


        return ans;
    }

}
