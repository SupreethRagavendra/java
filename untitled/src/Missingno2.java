public class Missingno2 {
    public static void main(String[] args) {

        int arr1 [] = {1,2,4,5};

        int n = 5;

        int sum = n*(n+1)/2;
        int ars = 0;

        for (int i = 0; i <n-1 ; i++) {
            ars = arr1[i] + ars;

        }

        int res = sum -ars;
        System.out.println(res);
    }
}
