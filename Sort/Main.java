public class Main{
   public static void main(String[] args){

      SelectionSort obj = new SelectionSort();

      int arr[] = {10,50,2,4,21,22,18,7};

      int arr2[] = {12,10,50,24,30,5,17,2,3,50,54};
      int arr3[] = {1,2,5,12,23}; //sorted Array

      //Selection Sort
      obj.sort(arr);
      // obj.printArray(arr);
      // obj.sortUsingLargeElement(arr2);
      // obj.printArray(arr2);


      //Bubble Sort
      // BubbleSort bobj = new BubbleSort();

      // bobj.sort(arr2);
      // bobj.printArray(arr2);
      // bobj.sort(arr3);
      // bobj.printArray(arr3);

      //Insertion Sort
      
      // InsertionSort iobj = new InsertionSort();
      // iobj.sort(arr2);
      // iobj.printArray(arr2);
   
      //Merge Sort
      MergeSort mobj = new MergeSort();

      mobj.mergeSort(arr2,0,arr2.length-1);
      mobj.printArray(arr2);
      
   }
}