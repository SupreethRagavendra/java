public class countword {


    public static void main(String[] args) {

        String str  = "welcome to java ";

        int count  =1;

        int n = str.length();

        for (int i = 0; i < n; i++) {

            if ((str.charAt(i)== ' ') && str.charAt(i+1)!=' ')
            {
count++;
            }

        }
        System.out.println(count);
    }
}
