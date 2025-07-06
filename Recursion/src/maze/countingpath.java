package maze;

public class countingpath {

    public static void main(String[] args) {

        boolean board[][] = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        int a = countingpathwithres(0, board, 0);
        System.out.println(a); // ✅ Output: 4


    }

    static int countingpaths(int row,int col)
    {
        if (row==1|| col==1)
        {
            return 1;
        }
        int left = countingpaths(row-1,col);
        int right = countingpaths(row,col-1);

        return left+right;
    }


    static int countingpathsdia (int row,int col)
    {
        if (row==1|| col==1)
        {
            return 1;
        }
        int left = countingpathsdia(row-1,col);
        int diagonial = countingpathsdia(row-1,col-1);

        int right = countingpathsdia(row,col-1);

        return left+right+diagonial;
    }



    static int countingpathwithres(int row, boolean maze [] [] ,int col)
    {

        if (row == maze.length - 1 && col == maze[0].length - 1) {
            return 1;
        }

        // ✅ THIS MUST BE FIRST TO AVOID OUT OF BOUNDS:
        if (row >= maze.length || col >= maze[0].length) {
            return 0;
        }

        if (!maze[row][col])
        {
            return 0;
        }

        int down = countingpathwithres(row + 1, maze, col);
        int right = countingpathwithres(row, maze, col + 1);

        return down + right;
    }

}

