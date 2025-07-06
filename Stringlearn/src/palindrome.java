public class palindrome {


    public static void main(String[] args) {

        String name = "mym";
boolean isPalindrome = true;
        int n = name.length();


        for (int i = 0; i <n/2 ; i++) {

            if (name.charAt(i)!=name.charAt(n-1-i))
            {
                isPalindrome = false;
                break;
            }


        }
        System.out.println(isPalindrome );


    }
}


