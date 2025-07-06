public class queens {


    public static void main(String[] args) {
        int n =4;
        boolean[][] board = new boolean[n][n];
        queens(board,0);

    }

    static  int queens(boolean board[][],int row)
    {
        if (row==board.length)
        {
            display(board);
            return 1 ;
        }
        int count=0;
        for (int col=0;col<board.length;col++)
        {
            if (issafe(board,row,col))
            {
                board[row][col]=true;

                count+=queens(board,row+1);
                board[row][col]=false;
            }

        }
        return  count;
    }

    private static boolean issafe(boolean[][] board, int row, int col) {

        //check
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // Check upper left diagonal
        for (int i = 1; i <= Math.min(row, col); i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // Check upper right diagonal
        for (int i = 1; i <= Math.min(row, board.length - col - 1); i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }

    private static void display(boolean board[][])
    {

        for (boolean[] row : board)
        {
            for (boolean element:row)
            {
                if (element)
                {
                    System.out.print("Q ");
                }
                else {
                    System.out.print("- ");
                }
            }
            System.out.println();

        }

        System.out.println("--------------------");

    }
}
