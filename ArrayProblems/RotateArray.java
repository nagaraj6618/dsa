public class RotateArray {
   public void rotateMethod1(int []nums,int d){

      // TC - O(n*d);
      // SC - O(1);

      int n = nums.length;
      d = d%n;
      // if(d==0) return;
      for(int i=0;i<d;i++){
         int x = nums[0];
         for(int j = 0;j<n-1;j++){
            nums[j] = nums[j+1]; 
         }
         nums[n-1] = x; 
      }
   }

   public void rotateMethod2(int[]nums , int d){

      // TC - O(n);
      // SC - O(n);

      int n = nums.length;
      d = d%n;
      int temp[] = new int[n];
      for(int i=d;i<n;i++){
         temp[i-d] = nums[i];
      }
      for(int i=0;i<d;i++){
         temp[n-d+i] = nums[i];
      }
      for(int i=0;i<n;i++){
         nums[i] = temp[i];
      }
      // printArray(temp);
   }

   void rotateMethod3(int []nums,int d){

      // TC - O(n);
      // SC - O(1);
      int n = nums.length;
      d = d%n;
      // if(d==0) return;

      //reverse the first d elements
      reverseArray(nums,0,d-1);

      //reverse the after d elements
      reverseArray(nums, d, n-1);

      //reverse all the elements
      reverseArray(nums,0,n-1);

   }

   void reverseArray(int []nums,int start,int end){
      while(start<end){
         swap(nums,start,end);
         start++;
         end--;
      }
   }

   void printArray(int []arr){
      for(int i:arr){
         System.out.print(i+" ");
      }
      System.out.println();
   }
   void swap(int []arr,int i,int j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
   }
}
