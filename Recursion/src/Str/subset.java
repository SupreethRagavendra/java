package Str;

import java.util.ArrayList;

public class subset {
    static int c =0;
    public static void main(String[] args) {

        System.out.println(  subsetArr("","abc"));

    }

    static  void subset(String proc,String org)
    {
        if (org.isEmpty())
        {


            System.out.print(proc +" ");
            return;
        }

        char ch = org.charAt(0);
        subset(proc+ch,org.substring(1));
        subset(proc,org.substring(1));
    }

    static ArrayList<String> subsetArr(String proc, String org)
    {
        if (org.isEmpty())
        {
ArrayList<String> list = new ArrayList<>();
list.add(proc);

            return list;
        }

        char ch = org.charAt(0);
      ArrayList<String>  left =  subsetArr(proc+ch,org.substring(1));
        ArrayList<String>  right =       subsetArr(proc,org.substring(1));

        right.addAll(left);
        return right;

    }
}

