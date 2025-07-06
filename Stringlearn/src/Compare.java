public class Compare {

    public static void main(String[] args) {

        String str = "helloasdas";
        String str2 = "helloasdasdasd";

       int n =str2.length();

boolean f = false;
        for (int i = 0; i < n; i++) {

           if (n<str2.length())
           {
               n=str2.length();
               if (str.charAt(i)==str2.charAt(i))
               {
                   f  = true;
                   System.out.println(" equal");
                   break;
               }
           }


        }
        if (f==false)
        {
            System.out.println("not equal");
        }
    }
}
