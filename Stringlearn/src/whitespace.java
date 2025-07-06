public class whitespace {

    public static void main(String[] args) {

        String str = "hell  o world";


        String resstr = "";

        int i =0;
        while (i<str.length())
        {
         char ch = (str.charAt(i));

         if (ch!= ' ')
         {
            resstr+=ch;

         }

         i++;
        }


        System.out.println(resstr);
    }
}
