public class Main {
    public static void main(String[] args) {
        int[][] initialMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Matrix matrix1 = new Matrix(initialMatrix);
        Matrix matrix2 = new Matrix(3, 3);

        System.out.println("Matrix1:");
        System.out.println(matrix1);

        System.out.println("Matrix2:");
        System.out.println(matrix2);

        matrix2.add(1, 2, 10);
        System.out.println("Matrix2 after adding a value:");
        System.out.println(matrix2);

        matrix1.transpose();
        System.out.println("Transposed Matrix1:");
        System.out.println(matrix1);

        System.out.println("Are Matrix1 and Matrix2 equal? " + matrix1.equals(matrix2));
    }
}
