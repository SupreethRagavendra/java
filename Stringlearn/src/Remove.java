public class Remove {

    public static void main(String[] args) {


        String str  = "madam";

        int n = str.length();

      /*
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i <n ; i++) {

            char ch = str.charAt(i);

            int idx = str.indexOf(ch,i+1);

            if (idx==-1)
            {
                sb.append(ch);
            }

        }
        System.out.println(sb); */



        char arr[]  = str.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {

            boolean rep = false;

            for (int j = i+1; j < n; j++) {

                if (arr[i]==arr[j])
                {
                    rep = true;
                    break;
                }
            }

            if (!rep)
            {
                sb.append(arr[i]);
            }

        }

        System.out.println(sb);
    }
}
