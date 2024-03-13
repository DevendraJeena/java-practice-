package array;

public class addOne {
    public static void main(String[] args) {
        int [][]matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

          int [][] result = addOne(matrix);

             for (int i=0; i<result.length; i++){
                for(int j=0 ; j<result[0].length; j++){
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
             }
    }

    public static int[][] addOne(int [][]matrix){
       int [][]result = new int[matrix.length][matrix[0].length];
        for(int i=0; i<matrix.length; i++){
            for (int j=0;j<matrix[0].length; j++){
                result[i][j] = 1 + matrix[i][j];
              
    }
}
    return result ; 
 }
}