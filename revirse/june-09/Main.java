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
   public static void main(String []s){
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

      //Permutation 
      int nums9[] = {1,2,3};
      List<List<Integer>> ans = new ArrayList<>();
      pobj.recurPermutation(nums9,0,ans);
      System.out.println("The all posible permutation of given array : "+ans);
      List<Integer> ds = new ArrayList<>();
      ans = new ArrayList<>();
      boolean freq[] = new boolean[nums9.length];
      pobj.recurPermutationMethod2(nums9,ans,ds,freq);
      System.out.println("The all posible permutation of given array : "+ans);

      //Next Permutation
      int nums10 []= {3,2,1};
      pobj.nextPermutation(nums10);
      mobj.printArray(nums10);

      //Leaders in Arrays
      int nums11[] = {10,22,12,3,0,6,2};
      List<Integer> leaderList = pobj.leaders(nums11);
      mobj.printList(leaderList);

      //Longest Consecutive Sequence in an Array
      int nums12[] = {3,5,10,6,7,8};
      int sequenceLength = pobj.longestConsecutiveSequence(nums12);
      System.out.println("Longest Consecutive Sequence in an Array : "+sequenceLength);

      //SetMatrix Zero
      int nums13[][] ={{1,1,1,1},{1,0,1,1},{1,1,0,1},{0,1,1,1}};
      int nums14[][] ={{1,1,1,1},{1,0,1,1},{1,1,0,1},{0,1,1,1}};
      pobj.setMatrixZeroM1(nums13);
      pobj.setMatrixZeroM2(nums14);

      //Rotate Matrix by 90 degree
      int nums15[][] = {{1,2,3},{4,5,6},{7,8,9}};
      pobj.rotateMatrix(nums15);

      //Count subarray sum
      int nums16[] = {3,1,2,4,1,1,6};
      int countSubarraySum = pobj.countSubarraySum(nums16,6);
      System.out.println("The count of subarray sum : "+countSubarraySum);

      //Pascal Triangle
      //Variation 1
      pobj.pascalVariation1(4,2);

      //Variation 2 TO print the elements in the row
      List<Integer> list = pobj.pascalVariation2(4);
      System.out.println("The Pascal value in the given row : "+list);

      //Variation 3 to generate all values.
      List<List<Integer>> pascalAns = pobj.pascalVariation3(5);
      System.out.println("All values of pascal triangle is : "+pascalAns);

      //3-Sum;
      int nums17[] = {-1,0,1,2,-1,-4};
      System.out.println("The three sum of all pair : "+pobj.threeSum(nums17));
      System.out.println("The three sum of all pair : "+pobj.threeSumM2(nums17));
      System.out.println("The three sum of all pair : "+pobj.threeSumM3(nums17));

      //4-Sum
      int nums18[] = {1,0,-1,0,-2,2};
      int nums19[] = {4,3,3,4,4,2,1,2,1,1};
      System.out.println("The four sum of all pair : "+pobj.fourSumM1(nums18,0));
      System.out.println("The four sum of all pair : "+pobj.fourSumM2(nums18,0));
      System.out.println("The four sum of all pair : "+pobj.fourSumM3(nums18,0));
      System.out.println("The four sum of all pair : "+pobj.fourSumM1(nums19,9));
      System.out.println("The four sum of all pair : "+pobj.fourSumM2(nums19,9));
      System.out.println("The four sum of all pair : "+pobj.fourSumM3(nums19,9));

      //Count subArray Sum with 0;
      int nums20[] = {9, -3, 3, -1, 6, -5};
      System.out.println("The All subarray sum with zeor is : "+pobj.countAllSubarray(nums20));
   }
}