package array;

public class findMax {

    public static int findMaximum (int [][]matrix){
         
        int max = matrix[0][0];
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if( matrix[i][j] > max ){
                    max = matrix[i][j];
                }
            }
        }
        return max ;
    }
    public static void main(String[] args) {
        
          int [][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
          };        
           
          int max = findMaximum(matrix);
          System.out.println("the required maximum number is " + max);
    }
}
       



