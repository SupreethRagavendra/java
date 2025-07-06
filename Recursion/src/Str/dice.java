package Str;

import java.util.ArrayList;

public class dice {


    public static void main(String[] args) {

//dice2("",4);

        System.out.println(dicelist("",4));

    }


    static  void dice2 (String pr, int target)
    {
        if ( target ==0)
        {
            System.out.println(pr);
            return;
        }

        for (int i = 1; i<=6&&i<=target; i++) {

            dice2(pr+i,target-i);



        }
    }

    static ArrayList<String> dicelist (String pr, int target)
    {
        if ( target ==0)
        {
           ArrayList<String> la = new ArrayList<>();
//            System.out.println(pr);
            la.add(pr);
            return la;
        }

        ArrayList<String> la = new ArrayList<>();

        for (int i = 1; i<=6&&i<=target; i++) {

            la.addAll(dicelist(pr+i,target-i));



        }
        return la;
    }
}
