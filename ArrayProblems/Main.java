public class Main{
   public static void main(String []args){

      // Finding the second largest and smallest Element in the array;
      // int []arr = {-23,1,22,32,23};
      // SecondLargeAndSmallElement obj = new SecondLargeAndSmallElement();
      // System.out.println("The Second Largest Element in tha array is : "+obj.secondLargestElement(arr));
      // System.out.println("The Second Smallest Element in the array is : "+obj.secondSmallestElement(arr));


      //Check the array is sorted or not;

      int []arr1 = {1,2,3};
      CheckArraySortedOrNot check = new CheckArraySortedOrNot();
      
      System.out.println("Is the array is sorted ? : "+check.isArraySorted(arr1, arr1.length));





   }
}