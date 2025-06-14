public class Main{
   public static void main(String []args){
      int nums1 [] = {1,2,3,4,5};
      BinarySearch bobj = new BinarySearch();
      System.out.println("The target found at : "+ bobj.search1(nums1,3));
      System.out.println("The target found at : "+ bobj.recursiveMethod(nums1,0,nums1.length-1,3));


      int nums2[] = {3,5,8,9,15,19};
      System.out.println("The Lower Bound at : "+bobj.loweBound(nums2,9));
   }
}