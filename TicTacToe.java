<<<<<<< Updated upstream
/**
 * TicTacToe
 * UC1 initializes and displays an empty Tic-Tac-Toe board in a proper
 * grid format. This use case introduces 2D arrays, nested loops,
 * and formatted console output.
 */
public class TicTacToe {
    static char[][] board = new char[3][3];
    public static void main(String[] args) {
        initializeBoard();
        printBoard();
=======
import java.util.Random;
import java.util.Scanner;
public class TicTacToe {
    static char[][] board = new char[3][3];
    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;
    public static void main(String[] args) {
        initializeBoard();
        printBoard();
        tossAndAssignSymbols();
        displayTossResult();
        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
>>>>>>> Stashed changes
    }
    static void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = '-';
            }
        }
    }
    static void printBoard() {
        System.out.println("-------------");

        for (int row = 0; row < 3; row++) {
            System.out.print("| ");

            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }

            System.out.println();
            System.out.println("-------------");
        }
    }
<<<<<<< Updated upstream
}
=======
    static void tossAndAssignSymbols() {
        Random random = new Random();
        int toss = random.nextInt(2);   // 0 or 1

        if (toss == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    static void displayTossResult() {
        System.out.println();
        if (isHumanTurn) {
            System.out.println("Human starts first with symbol " + humanSymbol);
            System.out.println("Computer gets symbol " + computerSymbol);
        } else {
            System.out.println("Computer starts first with symbol " + computerSymbol);
            System.out.println("Human gets symbol " + humanSymbol);
        }
    }
    static int getUserSlot() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter slot (1-9): ");
            int slot = sc.nextInt();

            return slot;
        }
    }
}
>>>>>>> Stashed changes
