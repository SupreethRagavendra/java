package maze;

public class Printpath {

static  int count =0;
    public static void main(String[] args) {
        pathprint("",3,3);
    }

    static  void  pathprint (String pr,int r,int c)
    {
        if (r==1 && c==1)

        {
            System.out.println(pr+ "and paths->"+ (++count));
            return;
        }

        if (r>1)
        {
            pathprint(pr+'D',r-1,c);
        }
        if (c>1)
        {
            pathprint(pr+'R',r,c-1);
        }


    }
}
