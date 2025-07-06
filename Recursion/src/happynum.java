import java.util.HashSet;
import java.util.Set;

public class happynum {


    public static void main(String[] args) {

int sum = 0;
        int num = 2;
        Set<Integer> seen = new HashSet<>();

        while ( !seen.contains(num))
        {
            seen.add(num);
sum = 0;
            while (num!=0)
            {
                int a = num % 10;
                num = num / 10;

               sum = sum +  (a * a);


            }
            num =sum;

        }
        if (num==1)
        {
            System.out.println("T");
        }
        else
        {
            System.out.println("f");
        }

    }


}
