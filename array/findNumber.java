package array;

public class findNumber {
    
public static void main(String[] args) {
        int [][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int num = 4 ;
        boolean found = false ; 

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if( matrix[i][j] == num){
                    found = true ;
                    System.out.println("target number " + num + " exists in the array ");
                    break;
                }
            }
            if(found){
                break;
            }
        }
        if(!found){
            System.out.println(" target number " + num + " not exist in the array ");
        }
    }
}
