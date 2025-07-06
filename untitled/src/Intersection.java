import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {


    public static void main(String[] args) {

        int arr1[] = {10,20,40,5};
        int arr2[] ={20,10,5,6};

        Arrays.sort(arr1);

        Arrays.sort(arr2);

        Set<Integer> s = new HashSet<>();


        int len1 = arr1.length;
        int len2 = arr2.length;

        int vis[] = new  int[len2];




        for (int i = 0; i < len1 ; i++) {


            for (int j = 0; j <len2 ; j++) {

                if(arr1[i]==arr2[j] && vis[j]==0)
                {
                    s.add(arr1[i]);
                    vis[j]=1;
                    break;
                }
                if (arr2[j]>arr1[i])
                {
                    break;
                }

            }

        }

        System.out.println(s);

    }
}
