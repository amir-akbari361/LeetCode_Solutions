public class GameOfLife {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int liveNeighbors = 0;
                for(int dx=-1;dx<=1;dx++)
                {
                    for(int dy=-1;dy<=1;dy++)
                    {
                        if(dx==0 && dy==0)
                        {
                            continue;
                        }
                        int x=i+dx;
                        int y=j+dy;
                        if(x>=0 && x<m && y>=0 && y<n && Math.abs(board[x][y])==1)
                        {
                            liveNeighbors++;
                        }
                    }
                }
                if(board[i][j]==1&&(liveNeighbors<2||liveNeighbors>3))
                {
                    board[i][j]=-1;
                }
                if(board[i][j]==0&&liveNeighbors==3)
                {
                    board[i][j]=2;
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            for (int j = 0; j < n; j++)
            {
                if(board[i][j]>=1)
                {
                    board[i][j]=1;
                }
                else
                {
                    board[i][j]=0;
                }
            }
        }
    }
}
