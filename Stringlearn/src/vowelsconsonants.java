public class vowelsconsonants {


    public static void main(String[] args) {

        int vow=0;
        int cons =0;

        String str = "GeeksforGeeks";

        int n = str.length();
        str= str.toLowerCase();

        for (int i = 0; i <n ; i++) {


            if (str.charAt(i)=='a' || str.charAt(i)=='e'||
            str.charAt(i)=='u'||str.charAt(i)=='i'|| str.charAt(i)=='o')
            {
                vow++;
            }

            else if (str.charAt(i)!='a' && str.charAt(i)!='e'&&
                    str.charAt(i)!='u' && str.charAt(i)!='i'&& str.charAt(i)!='o')
            {
                cons++;
            }



        }

        System.out.println(cons);
        System.out.println(vow);
    }
}
