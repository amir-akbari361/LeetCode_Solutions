import java.util.HashSet;

public class IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> arz = new HashSet<>();
            HashSet<Character> tol = new HashSet<>();

            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    if (!arz.add(board[i][j])) {
                        return false;
                    }
                }
                if (board[j][i] != '.') {
                    if (!tol.add(board[j][i])) {
                        return false;
                    }
                }
            }
        }
        for (int box_row=0; box_row< 3;box_row++)
        {
            for(int box_col=0; box_col< 3;box_col++)
            {
                HashSet<Character> set = new HashSet<>();
                for(int i=0;i<3;i++)
                {
                    for(int j=0;j<3;j++)
                    {
                        char current=board[3*box_row+i][3*box_col+j];
                        if(current!='.'){
                            if(!set.add(current)){
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

}
