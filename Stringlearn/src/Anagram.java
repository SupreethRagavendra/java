import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "heart";
        String str2  = "earth";

str1=str1.replaceAll("\\s","");
      str2=  str2.replaceAll("\\s","");


        int n1 = str1.length();
        int n2 = str2.length();


        if (n1==n2)
        {
            char[] ch1  = str1.toLowerCase().toCharArray();
            char[] ch2  = str2.toLowerCase().toCharArray();

            Arrays.sort(ch1);

            Arrays.sort(ch2);

            if(Arrays.equals(ch1,ch2))
            {
                System.out.println("yes string are anagram");
            }
            else {
                System.out.println("No the string are not anagram");
            }
        }
    }
}
