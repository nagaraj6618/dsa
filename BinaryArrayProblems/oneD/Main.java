public class Main{
   public static void main(String []args){
      int nums1 [] = {1,2,3,4,5};
      BinarySearch bobj = new BinarySearch();
      System.out.println("The target found at : "+ bobj.search1(nums1,3));
      System.out.println("The target found at : "+ bobj.recursiveMethod(nums1,0,nums1.length-1,3));


      int nums2[] = {3,5,8,9,15,19};
      System.out.println("The Lower Bound at : "+bobj.loweBound(nums2,9));

      //Floor and Ceil
      int nums3[] = {10,12,20,30,40,50};
      int nums4[] = {3, 4, 4, 7, 8, 10};
      bobj.floorAndCeil(nums3,12);
      bobj.floorAndCeil(nums4,2);

      //Find the total Occurance of the given target;
      int nums5[] = {2, 2 , 3 , 3 , 3 , 3 , 4};
      System.out.println("The Total occurance : "+bobj.totalOccuranceOfNumber(nums5,4));

   }
}