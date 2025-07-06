public class Nknight {


    public static void main(String[] args) {


      int boards[][] = new int[3][3];
      int n = boards.length;
      int expvalue =0;
        System.out.println(  nightscheck(boards,0,0,n,expvalue));



    }

    static boolean nightscheck(int board[][] ,int r,int c,int n ,int expValue)
    {

        if (r<0||c<0||r>=n||c>=n)
        {
            return false;
        }
        if (expValue == n * n - 1) return true;

        // Manually try all 8 knight moves:
        if (nightscheck(board, r - 2, c + 1, n, expValue + 1)) return true;
        if (nightscheck(board, r - 1, c + 2, n, expValue + 1)) return true;
        if (nightscheck(board, r + 1, c + 2, n, expValue + 1)) return true;
        if (nightscheck(board, r + 2, c + 1, n, expValue + 1)) return true;
        if (nightscheck(board, r + 2, c - 1, n, expValue + 1)) return true;
        if (nightscheck(board, r + 1, c - 2, n, expValue + 1)) return true;
        if (nightscheck(board, r - 1, c - 2, n, expValue + 1)) return true;
        if (nightscheck(board, r - 2, c - 1, n, expValue + 1)) return true;

        // If none of the paths work
        return false;
    }
}
