public class Main{
   public static void main(String []args){

      // Finding the second largest and smallest Element in the array;
      // int []arr = {-23,1,22,22,22};
      // SecondLargeAndSmallElement obj = new SecondLargeAndSmallElement();
      // System.out.println("The Second Largest Element in tha array is : "+obj.secondLargestElement(arr));
      // System.out.println("The Second Smallest Element in the array is : "+obj.secondSmallestElement(arr));


      //Check the array is sorted or not;

      // int []arr1 = {3,4,5,1,2};
    
      // CheckArraySortedOrNot check = new CheckArraySortedOrNot();
      
      // System.out.println("Is the array is sorted and rotated ? : "+check.checkArraySortedAndRotatedOptimized(arr1));

      // check.rotateArray(arr1,4);
      // check.printArray(arr1);
      // System.out.println("Is the array is sorted ? : "+check.checks(arr1));


      // Rotate the Array;
      int arr2[] = {8,18,7,6,5};
      RotateArray rotate = new RotateArray();
      rotate.rightRotateArray(arr2, 2);
      // rotate.printArray(arr2);


      //Union of two sorted Array;
      // int nums1[] = {1,1,2,4,5,6,7,7,9,10,11};
      // int nums2[] = {1,1,2,2,3,5,5,6,7,20};

      // UnionArray uobj = new UnionArray();
      // uobj.unionTwoArray(nums1,nums2);
      // System.out.println("Intersection of Two Arrays");
      // for(int a : uobj.intersectionTwoArray(nums1, nums2)){
      //    System.out.print(a+" ");
      // }
      // System.out.println("");


      // int nums1[] = {1,1,1,1,-1,2,3,3,1,1,1,2,3};
      // int nums2[] = {1,1,1,1,1,1,1,7,4,3};
      // SubArray sobj = new SubArray();
      // System.out.println("The Longest SubArray is : "+sobj.positiveAndNegativeLongestSubArray(nums1, 5));

      // System.out.println("The Longest positive subArray is : "+sobj.positiveLongestSubArray(nums2, 7));


      //Two Sum
      // int nums2[] = {2,4,6,5,8,11};
      // TwoSum tobj = new TwoSum();
      // tobj.twoSumOptimalMethod(nums2, 14);
      // tobj.twoSumUsingHashMap(nums2, 13);

      //Sort an array 0's,1's and 2's
      // int nums3[] = {1,0,0,2,1,2,2};
      // SortArray sortObj = new SortArray();
      // sortObj.sortArray(nums3);

   }
}