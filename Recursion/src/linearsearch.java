import java.util.ArrayList;
import java.util.Arrays;

public class linearsearch {

    public static void main(String[] args) {


        int arr[] = {10,10,30,40};

        int target  = 10;
//        System.out.println("result is :"+(check(arr,target,0)));

//        ArrayList<Integer> ans = findallindex(arr,target,0 ,new ArrayList<>());
//        System.out.println(ans);

        System.out.println(findAll(arr,target,0));

    }


    static  boolean check(int arr[],int t,int index )
    {

        if (index>= arr.length)
        {
            return  false;
        }

        if (arr[index]==t)
        {
            return true;
        }

        return  check(arr,t,index+1);

    }

    static  ArrayList<Integer> findallindex(int arr[], int t, int i, ArrayList<Integer> list)
    {
        if (i>= arr.length)
        {
            return  list;
        }
        if (arr[i]==t)
        {
            list.add(i);
        }
        return  findallindex(arr,t,i+1,list);
    }

    static ArrayList<Integer> findAll (int arr[], int t, int index)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if (index>= arr.length)
        {
            return  list;
        }

        if (arr[index]==t)
        {
            list.add(index);
        }
        ArrayList<Integer> ansl = findAll(arr,t,index+1);
        list.addAll(ansl);
        return  list;
    }
}
