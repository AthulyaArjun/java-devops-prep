/**
 * Tic-tac-toe is played by two players A and B on a 3 x 3 grid. The rules of Tic-Tac-Toe are:

 * Players take turns placing characters into empty squares ' '.
 * The first player A always places 'X' characters, while the second player B always places 'O' characters.
 * 'X' and 'O' characters are always placed into empty squares, never on filled ones.
 * The game ends when there are three of the same (non-empty) character filling any row, column, or diagonal.
 * The game also ends if all squares are non-empty.
 * No more moves can be played if the game is over.
 * Given a 2D integer array moves where moves[i] = [rowi, coli] indicates that the ith move
 * will be played on grid[rowi][coli]. return the winner of the game if it exists (A or B).
 * In case the game ends in a draw return "Draw". If there are still movements to play return "Pending".

 * You can assume that moves is valid (i.e., it follows the rules of Tic-Tac-Toe),
 * the grid is initially empty, and A will play first.
 */

package LeetCodePractices.Easy;

import java.util.Scanner;

public class TicTacToe {

    public String tictactoe(int[][] moves) {
        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' '; // empty board
            }
        }

        for (int i = 0; i < moves.length; i++) {
            int row = moves[i][0];
            int col = moves[i][1];

            char symbol;
            String player;

            if (i % 2 == 0) {
                symbol = 'X';
                player = "A";
            } else {
                symbol = 'O';
                player = "B";
            }

            board[row][col] = symbol;

            if (isWinner(board, symbol)) {
                return player;
            }
        }

        if (moves.length == 9) {
            return "Draw";
        }
        return "Pending";
    }

        public boolean isWinner(char[][] board, char symbol) {
            // Check rows
            for (int i = 0; i < 3; i++) {
                if (board[i][0] == symbol &&
                        board[i][1] == symbol &&
                        board[i][2] == symbol) {
                    return true;
                }
            }

            // Check columns
            for (int j = 0; j < 3; j++) {
                if (board[0][j] == symbol &&
                        board[1][j] == symbol &&
                        board[2][j] == symbol) {
                    return true;
                }
            }

            // Check main diagonal
            if (board[0][0] == symbol &&
                    board[1][1] == symbol &&
                    board[2][2] == symbol) {
                return true;
            }

            // Check anti-diagonal
            if (board[0][2] == symbol &&
                    board[1][1] == symbol &&
                    board[2][0] == symbol) {
                return true;
            }

            return false;
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of moves:");
        int n = sc.nextInt();

        int[][] moves = new int[n][2];

        for (int i=0; i<n; i++){
            moves[i][0] = sc.nextInt();
            moves[i][1] = sc.nextInt();
        }

        TicTacToe obj = new TicTacToe();
        String result = obj.tictactoe(moves);

        System.out.println(result);

        sc.close();

    }
}

