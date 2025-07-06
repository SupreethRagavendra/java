public class ReverseStr {


    public static void main(String[] args) {

        String  str = "hello";

        //op olleh
        int n = str.length();

        String rev = "";

        for (int i = n-1; i >=0 ; i--) {

      char ch =   (str.charAt(i));
      rev =   rev + ch;

        }
        System.out.println(rev);


    }
}
