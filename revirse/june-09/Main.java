public class Main{
   public void printArray(int nums[]){
      for(int a : nums){
         System.out.print(a+" ");
      }
      System.out.println("");
   }
   public static void main(String []args){
      Main mobj = new Main();
      
      //Merge Sort
      Merge mergeObj = new Merge();
      int nums1[] = {5,2,1,7,0,8};
      mergeObj.mergeSort(nums1, 0, nums1.length-1);
      mobj.printArray(nums1);

      // Quick Sort;
      Quick quickObj = new Quick();
      int nums2[] = {5,2,3,1,7,0,8};
      quickObj.quickSort(nums2, 0, nums2.length-1);
      mobj.printArray(nums2);

      //Problems
      Problem pobj = new Problem();
      
      //Move Zeros
      int nums3 [] = {1,0,0,2,3,0,4,0,1};
      pobj.moveZeros(nums3);
      mobj.printArray(nums3);

   }
}