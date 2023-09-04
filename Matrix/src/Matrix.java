import java.util.Arrays;

public class Matrix {
    private int[][] matrix;

    public Matrix(int rows, int columns) {
        if (rows <= 0 || columns <= 0) {
            throw new IllegalArgumentException("Размеры матрицы должны быть положительными числами.");
        }

        this.matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            Arrays.fill(matrix[i], 0);
        }
    }

    public Matrix(int[][] existingMatrix) {
        if (existingMatrix == null || existingMatrix.length == 0 || existingMatrix[0].length == 0) {
            throw new IllegalArgumentException("Недопустимая матрица.");
        }

        int rows = existingMatrix.length;
        int columns = existingMatrix[0].length;

        this.matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.matrix[i][j] = existingMatrix[i][j];
            }
        }
    }

    public void add(int row, int column, int value) {
        if (row <= 0 || row > matrix.length || column <= 0 || column > matrix[0].length) {
            throw new IllegalArgumentException("Неверные индексы строки или столбца.");
        }
        matrix[row - 1][column - 1] = value;
    }

    public void transpose() {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transposedMatrix = new int[columns][rows];

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        matrix = transposedMatrix;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Matrix)) {
            return false;
        }
        Matrix otherMatrix = (Matrix) obj;
        return Arrays.deepEquals(this.matrix, otherMatrix.matrix);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : matrix) {
            for (int value : row) {
                sb.append(value).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}