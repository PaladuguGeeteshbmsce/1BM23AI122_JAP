package BM23AI122;
public class chessboard {

    public static void printChessboard(int rows, int cols) {
        // Outer loop for each row
        for (int i = 0; i < rows; i++) {
            // Inner loop for each column
            for (int j = 0; j < cols; j++) {
                // Print 'X' if the sum of row and column index is even, else print 'O'
                if ((i + j) % 2 == 0) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 8;  // Number of rows (can be changed)
        int cols = 8;  // Number of columns (can be changed)


        printChessboard(rows, cols);
    }
}

/*
X O X O X O X O
O X O X O X O X
X O X O X O X O
O X O X O X O X
X O X O X O X O
O X O X O X O X
X O X O X O X O
O X O X O X O X
*/
