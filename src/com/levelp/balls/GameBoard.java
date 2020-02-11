class GameBoard
{
    public static final byte RED = 1;
    public static final byte BLACK = 2;
    private int[][] matt;
    /////////////////////////////////////////////////////////
    public GameBoard()
    {
        matt = new int[7][6];
        for(int c=0;c<7;c++)
            for(int r=0;r<6;r++)
                matt[c][r]=0;
    }
    /////////////////////////////////////////////////////////
    public boolean isFull()
    {
        for(int c=0;c<7;c++)
            for(int r=0;r<6;r++)
                if(matt[c][r]==0)
                    return false;
        return true;
    }
    /////////////////////////////////////////////////////////
    public int hasWinner()
    {

        for(int c=0;c<7;c++)
        {
            for(int r=0;r<6;r++)
            {
                if(hasFourSouth(c,r))
                {

                    return matt[c][r];
                }
                if(hasFourEast(c,r))
                {
                    return matt[c][r];
                }
                if(hasFourSouthEast(c,r))
                {
                    return matt[c][r];
                }
                if(hasFourSouthWest(c,r))
                {
                    return matt[c][r];
                }
            }
        }
        return 0;
    }
    /////////////////////////////////////////////////////////
    public boolean dropPiece(byte c,boolean redTurn)
    {
        int r = 0;
        if(matt[c][0]!=0)
            return false;
        while((matt[c][r]==0)&&(r<5))
            r++;
        if(redTurn)
            if(matt[c][r]!=0)
                matt[c][r-1] = RED;
            else
                matt[c][5] = RED;
        else
        if(matt[c][r]!=0)
            matt[c][r-1] = BLACK;
        else
            matt[c][5] = BLACK;
        return true;
    }
    /////////////////////////////////////////////////////////
    public String toString()
    {
        String build = "\n\n0123456\n";
        for(int c=0;c<6;c++)
        {

            for(int r=0;r<7;r++)
            {
                if(matt[r][c]==RED)
                    build+=(char)82;
                else if(matt[r][c]==BLACK)
                    build+=(char)66;
                else
                    build+=(char)46;
            }
            build+="\n";
        }
        return build+"\n";
    }
    /////////////////////////////////////////////////////////
    private boolean hasFourEast(int c,int r)
    {
        int color = matt[c][r];
        if(color==0)
            return false;
        for(int x=c;x<c+4;x++)
        {
            if(x>6)
                return false;
            else if(matt[x][r]!=color)
                return false;
        }
        return true;
    }
    /////////////////////////////////////////////////////////
    private boolean hasFourSouthEast(int c,int r)
    {
        int color = matt[c][r];

        if(color==0)
            return false;
        int y=c; int x=r;
        for(int k=0;k<4;k++)
        {

            if((y>6)||(x>5))
                return false;
            if(matt[y][x]!=color)
                return false;
            y++; x++;
        }
        return true;
    }
    /////////////////////////////////////////////////////////
    private boolean hasFourSouthWest(int c, int r)
    {
        int color = matt[c][r];

        if(color==0)
            return false;
        int y=c; int x=r;
        for(int k=0;k<4;k++)
        {

            if((y<0)||(x>5))
                return false;
            if(matt[y][x]!=color)
                return false;
            y--; x++;
        }
        return true;
    }
    /////////////////////////////////////////////////////////
    private boolean hasFourSouth(int c, int r)
    {
        int color = matt[c][r];

        if(color==0)
        {
            return false;
        }
        for(int x=r;x<r+4;x++)
        {

            if(x>5)
                return false;
            else if(matt[c][x]!=color)
                return false;
        }

        return true;
    }
}