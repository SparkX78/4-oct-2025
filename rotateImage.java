public class rotateImage {
    public static void rotate(int[][] nums){
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j<n ; j++){
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }


        }
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n/2; j++){
                int temp = nums[i][j];
                nums[i][j] = nums[i][n-j-1];
                nums[i][n-j-1] = temp;
            }
            
        }
        
    }
    public static void printMatrix(int[][] nums){
        for(int[] row : nums){
            for(int value : row){
                System.out.print(value + " ");
            }
            System.out.println();
        }
            
    }
    public static void main(String[] args) {
        int[][] matrix = {

            {1,4,5,6},
            {9,7,8,1},
            {2,5,1,0},
            {8,7,1,4}
        };
        rotateImage rot = new rotateImage();
        rot.rotate(matrix);
        System.out.println("the rotate matrix");
        printMatrix(matrix);
    }
}
