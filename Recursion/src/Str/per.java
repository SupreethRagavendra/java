package Str;

import java.util.ArrayList;
import java.util.Arrays;

public class per {
    public static void main(String[] args) {

        ArrayList<String> sr =permutationList("","abc");
        System.out.println(sr);;


    }

    static  void  permutation(String strp , String up)
    {

        if (up.isEmpty())
        {
              System.out.println(strp);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <=strp.length() ; i++) {
            String f = strp.substring(0,i);
            String s = strp.substring(i,strp.length());



        }

    }

    static  ArrayList<String>  permutationList(String strp , String up)
    {

        if (up.isEmpty())

        {
            ArrayList<String> sar = new ArrayList<>();
sar.add(strp);
            return sar;
        }

        char ch = up.charAt(0);
        ArrayList<String> sar = new ArrayList<>();
        for (int i = 0; i <=strp.length() ; i++) {
            String f = strp.substring(0,i);
            String s = strp.substring(i,strp.length());
            sar.addAll(permutationList(f+ch+s, up.substring(1)));



        }
        return sar;
    }
}
