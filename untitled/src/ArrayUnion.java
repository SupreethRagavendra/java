import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayUnion {

    public static void main(String[] args) {
        int arr1[] = {1,1,2,3,4,5};
        int arr2[] = {2,3,4,4,5};

        System.out.println(arr1.length);
        System.out.println(arr2.length);


        Set<Integer> st = new HashSet<>();


        for (int i = 0; i < arr1.length; i++) {
            st.add(arr1[i]);

        }
        for (int i = 0; i < arr2.length; i++) {
            st.add(arr2[i]);

        }

        int union[] = new int[st.size()];
int a =0;
       for (int i : st)
       {
           union[a++]=i;
       }

        System.out.println(Arrays.toString(union));
    }




}
