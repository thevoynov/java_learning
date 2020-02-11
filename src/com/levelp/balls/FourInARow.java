import java.util.Scanner;
import java.io.IOException;
public class FourInARow
{
    static GameBoard BOARD;
    public static void main(String args[])
    {
        boolean gameOver = false;
        boolean stillPlaying = true;
        boolean redTurn = true;
        while(stillPlaying)
        {
            clear_display();
            BOARD = new GameBoard();
            // init board display
            System.out.println(BOARD);
            while(!gameOver)
            {
                update_game(BOARD,redTurn);
                redTurn = !redTurn;
                System.out.println(BOARD);
                /* game status update here */
                switch(update_game_status(BOARD))
                {
                    case -1: {break; } // nothing special, move along
                    case 0:
                    {
                        gameOver = true;
                        System.out.printf("TIE GAME, Board has been Filled!\n");
                        // add crap about playing again
                        stillPlaying = false;
                        break;
                    }
                    case 1:
                    {
                        gameOver = true;
                        System.out.printf("RED WINS GAME!\n");
                        // add **** about playing again
                        stillPlaying = false;
                        break;
                    }
                    case 2:
                    {
                        gameOver = true;
                        System.out.printf("BLACK WINS GAME!\n");
                        // add stuff about playing again
                        stillPlaying = false;
                        break;
                    }
                    default: {break; }
                }
            }
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////
    public static byte update_game_status(GameBoard board)
    {
        // check for: 4 in a row, full board
        int status = board.hasWinner();

        if(status==1) // red win
            return 1;
        if(status==2) // black win
            return 2;
        if(board.isFull())
            return 0;
        return -1;
    }
    ///////////////////////////////////////////////////////////////////////////////////
    public static void update_game(GameBoard board, boolean redTurn)
    {
        Scanner kb = new Scanner(System.in);
        if(redTurn)
            System.out.printf("RED [" + (char)82 + "] select column ==>  ");
        else
            System.out.printf("BLACK [" + (char)66 + "] select column ==>  ");
        boolean successfull_drop = false;
        while(!successfull_drop)
        {
            byte in = 0;
            try
            {
                in = kb.nextByte();
                while(!board.dropPiece(in,redTurn))
                {
                    System.out.print("Invalid, Select Again ==>  ");
                    in = kb.nextByte();
                }
                successfull_drop = true;
            }catch(Exception idiotError)
            {

                break;
            }

        }
        clear_display();
    }
    ///////////////////////////////////////////////////////////////////////////////////
    public static void clear_display()
    {
        System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    ///////////////////////////////////////////////////////////////////////////////////

}