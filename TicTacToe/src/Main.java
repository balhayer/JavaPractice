import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private static char[][] board = new char[3][3];

    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        initBoard();

        boolean winner = false;
        boolean turn = true;
        int choiceR;
        int choiceC;
        while(winner != true){
            displayBoard();
            if(turn){
                System.out.print("X turn: choose your location (row,column): ");
                choiceR = keyboard.nextInt();
                choiceC = keyboard.nextInt();

                if(board[choiceR][choiceC] == 'O' || board[choiceR][choiceC] == 'X' ){
                    System.out.println("That spot has already been taken, try again");
                }
                else {
                    board[choiceR][choiceC] = 'X';
                    turn = false;
                }
            }
            else{
                System.out.print("O turn: choose your location (row,column): ");
                choiceR = keyboard.nextInt();
                choiceC = keyboard.nextInt();

                if(board[choiceR][choiceC] == 'O' || board[choiceR][choiceC] == 'X' ){
                    System.out.println("That spot has already been taken, try again");
                }
                else{
                    board[choiceR][choiceC] = 'O';
                    turn = true;
                }

            }

            //After choosing, check if there is a winner yet
            if(board[0][1] == 'X' && board[0][2] == 'X' && board[0][0] == 'X' || board[0][1] == 'O' && board[0][2] == 'O' && board[0][0] == 'O'){
                System.out.println("The Winner is " + board[0][1]);
                winner = true;
            }
            else if(board[1][1] == 'X' && board[1][0] == 'X' && board[1][2] == 'X' || board[1][1] == 'O' && board[1][0] == 'O' && board[1][2] == 'O'){
                System.out.println("The Winner is " + board[1][1]);
                winner = true;
            }
            else if(board[2][1] == 'X' && board[2][0] == 'X' && board[2][2] == 'X' || board[2][1] == 'O' && board[2][0] == 'O' && board[2][2] == 'O'){
                System.out.println("The Winner is " + board[2][1]);
                winner = true;
            }
            else if(board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X' || board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O'){
                System.out.println("The Winner is " + board[1][0]);
                winner = true;
            }
            else if(board[1][1] == 'X' && board[0][1] == 'X' && board[2][1] == 'X' || board[1][1] == 'O' && board[0][1] == 'O' && board[2][1] == 'O'){
                System.out.println("The Winner is " + board[1][1]);
                winner = true;
            }
            else if(board[1][2] == 'X' && board[0][2] == 'X' && board[2][2] == 'X' || board[1][2] == 'O' && board[0][2] == 'O' && board[2][2] == 'O'){
                System.out.println("The Winner is " + board[1][2]);
                winner = true;
            }
            else if(board[1][1] == 'X' && board[0][0] == 'X' && board[2][2] == 'X' || board[1][1] == 'O' && board[0][0] == 'O' && board[2][2] == 'O' ){
                System.out.println("The Winner is " + board[1][1]);
                winner = true;
            }
            else if(board[1][1] == 'X' && board[0][2] == 'X' && board[2][0] == 'X' || board[1][1] == 'O' && board[0][2] == 'O' && board[2][0] == 'O' ){
                System.out.println("The Winner is " + board[1][1]);
                winner = true;
            }

            //Check if board is full and call it a draw
        }

    }

    public static void initBoard()
    {
        // fills up the board with blanks
        for ( int r=0; r<3; r++ )
            for ( int c=0; c<3; c++ )
                board[r][c] = ' ';
    }


    public static void displayBoard()
    {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }


    public static void displayBoard2()
    {
        for ( int r=0; r<3; r++ )
        {
            System.out.print("\t"+r+" ");
            for ( int c=0; c<3; c++ )
            {
                System.out.print( board[r][c] + " " );
            }
            System.out.println();
        }
        System.out.println("\t  0 1 2 ");
    }
}
