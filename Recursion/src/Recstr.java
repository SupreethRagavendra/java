public class Recstr {


    public static void main(String[] args) {




        System.out.println(  skipword("bacapplecad"));





    }
    static  void skip(String p, String org)
    {
        if (org.isEmpty())
        {
            System.out.println("new string is "+ p);
            return;
        }
        char ch = org.charAt(0);

        if (ch=='a' || ch=='A')
        {
            skip(p,org.substring(1));
        }
        else
        {
            skip(p+ch,org.substring(1));
        }
    }


    static  String skipword (String org)
    {
        if (org.isEmpty())
        {
          return  "";
        }

        if ((org.startsWith("apple")))
        {
            return skipword(org.substring(5));

        }
        else
        {
            return  org.charAt(0)+skipword(org.substring(1));
        }


    }
}
