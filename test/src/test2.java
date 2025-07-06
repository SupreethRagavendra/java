public class test2 {

    public static void main(String[] args) {

        int  num = 18;
int sum =0;

        while (num>0)
        {
            int n = num % 10;
            sum = sum +n;
            num=num/10;
        }


        if (num%sum==0)
        {
            System.out.println("yes it is a harshad number");
        }
        else {
            System.out.println("no it is not a harshad number");

        }
    }
}
