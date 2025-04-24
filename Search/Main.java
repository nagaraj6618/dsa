public class Main{
   public static void main(String[]args){

      int [] nums = {1,4,5,23,44,56,121};

      BinarySearch obj = new BinarySearch();
      int found= obj.search(nums, 24);
      System.out.println("The Element found at index : "+found);

      found = obj.searchIfNotFoundReturnExpectIndex(nums,22);
      System.out.println("Expected Index : "+found);
   }
}