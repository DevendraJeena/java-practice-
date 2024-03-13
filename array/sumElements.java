package array;

public class sumElements {

    public static void main(String[] args) {
        int [][]matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
            int result = sum(matrix);
            System.out.println("the sum of all the elements is" + result);

    }
      
     public static int sum(int[][]matrix){
          int result = 0;
          for(int i=0; i<matrix.length; i++){
            for (int j=0;j<matrix[0].length; j++){
                result += matrix[i][j];
            }
          }
          return result;
     }

}
