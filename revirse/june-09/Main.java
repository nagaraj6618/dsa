import java.util.*;
public class Main{
   //To print 1d Array.
   public void printArray(int nums[]){
      for(int a : nums){
         System.out.print(a+" ");
      }
      System.out.println("");
   }
   //To print the list;
   public void printList(List<Integer>list){
      for(int a:list){
         System.out.print(a+" ");
      }
      System.out.println();
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

      //Union
      int nums4[] = {1,2,3,4,6,7};
      int nums5[] = {1,2,5,6,7,8,9};
      List<Integer> unionList = pobj.union(nums4, nums5);
      mobj.printList(unionList);

      //Intersection
      List<Integer> interSectionList = pobj.intersection(nums4,nums5);
      mobj.printList(interSectionList);

      //Missing number in the array;
      int nums6[] = {1,2,5,6,7,0,3};
      int missingElement = pobj.missingElement(nums6);
      System.out.println("The Missing element is "+missingElement);

      //Longest subArray Sum with k method 1;
      int nums8[] = {2,3,5,1,9,1,1,1,7};
      int nums7[] = {2,3,5,1,9,-10,-2,8,1,7};
      System.out.println("The maximum sum with k : "+pobj.LongestSubArraySumKM1(nums8,10));

      System.out.println("The maximum sum with k : "+pobj.LongestSubArraySumKM2(nums7,10));
   }
}