public class test5 {

    public static void main(String[] args) {

        int num[] ={-2,3,4,-5,0};

        int evenno =0;
        int oddno = 0;
        int pos = 0;
        int neg =0;

        int n = num.length;

        for (int i = 0; i < n; i++) {

            if (num[i]%2==0)
            {

                evenno++;
            }

            else if (num[i]%2!=0) {

                oddno++;
            }



        }


        for (int i = 0; i < n; i++) {

            if  (num[i]>0) {
                pos++;

            } else if (num[i]<0) {
                neg++;

            }

        }
        System.out.println(evenno);
        System.out.println(oddno);
        System.out.println(pos);
        System.out.println(neg);
    }
}
