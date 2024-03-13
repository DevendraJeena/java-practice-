public class myClass {

    public static void main(String[] args) {
        // Matrices
        int[][] matrixA = { 
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrixB = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Initialize the sum matrix
        int[][] sum = new int[matrixA.length][matrixA[0].length];

        // Compute the sum of corresponding elements of matrixA and matrixB
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // Print the resulting matrix
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[0].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}