public class MatrixCalculator {
    public static void main(String[] args) {
        // declare the matrices
        int[][] matrix1 = {{2, 3, 1},{7, 1, 6}, {9, 2, 4}};
        int[][] matrix2 = {{8, 5, 3},{3, 9, 2}, {2, 7, 3}};

        // declare the sum matrix
        int[][] sumMatrix = new int[3][3];

        // going through each number and adding them up in a final matrix
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];

        // displaying the sum matrix
        System.out.println("Sum Matrix:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++)
                System.out.print(sumMatrix[i][j] + " ");
            System.out.println();
        }

        // declare the multiply matrix
        int[][] mMatrix = new int[3][3];

        // making the operation
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    mMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // displaying the multiply matrix
        System.out.println("M Matrix:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++)
                System.out.print(mMatrix[i][j] + " ");
            System.out.println();
        }
    }
}
