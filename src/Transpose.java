public class Transpose {
    public static void main(String[] args) {
        int[][] matris1 = {
                {2, 3, 4},
                {5, 6, 4}
        };

        int[][] matris2 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("Matris 1 :");
        printMatrix(matris1);

        System.out.println("Transpoze 1 :");
        int[][] transpoze1 = transpose(matris1);
        printMatrix(transpoze1);

        System.out.println();

        System.out.println("Matris 2 :");
        printMatrix(matris2);

        System.out.println("Transpoze 2 :");
        int[][] transpoze2 = transpose(matris2);
        printMatrix(transpoze2);
    }

    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] transposed = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}