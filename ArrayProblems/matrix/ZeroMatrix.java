public class ZeroMatrix{

   public void setMatrixZeroBrute(int [][]nums){

      int n = nums.length;
      int m = nums[0].length;

      for(int i=0;i<n;i++){
         for(int j=0;j<m;j++){
            if(nums[i][j] == 0){
               setMatrixRow(nums, i);
               setMatrixColoumn(nums, j);
            }
         }
      }
      replaceZero(nums);

   }
   public void replaceZero(int []nums[]){
      int n = nums.length;
      int m = nums[0].length;

      for(int i=0;i<n;i++){
         for(int j=0;j<m;j++){
            if(nums[i][j] == -1){
               nums[i][j] = 0;
            }
         }
      }
   }
   public void setMatrixRow(int [][]nums,int i){
      int m = nums[0].length;
      for(int j=0;j<m;j++){
         if(nums[i][j]!=0){
            nums[i][j] = -1;
         }
      }
   }
   public void setMatrixColoumn(int [][]nums,int j){
      int n = nums.length;
      for(int i=0;i<n;i++){
         if(nums[i][j]!=0){
            nums[i][j] = -1;
         }
      }
   }
   void printMatrix(int [][]nums){
      int n = nums.length;
      int m = nums[0].length;
      System.out.println("Printing the matrix...");
      for(int i=0;i<n;i++){
         for(int j=0;j<m;j++){
            System.out.print(nums[i][j]+" ");
         }
         System.out.println();
      }
   }
   public static void main(String []args){
      int nums[][] = {{1,1,1},{1,0,1},{1,1,1}};

      ZeroMatrix obj = new ZeroMatrix();

      obj.setMatrixZeroBrute(nums);
      obj.printMatrix(nums);
   }
}