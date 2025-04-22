public class Main{
   public static void main(String[] args){

      DynamicArray dynamicArray = new DynamicArray(5);

      dynamicArray.add("A");
      dynamicArray.add("B");
      dynamicArray.add("C");
      dynamicArray.add("D");
      dynamicArray.add("E");
      dynamicArray.add("f");
      
      dynamicArray.insert(1, "X");

      dynamicArray.delete(11);
      System.out.println("Size : "+dynamicArray.sizeOf());
      System.out.println("Capacity : "+ dynamicArray.capacity);
      System.out.println("Values : "+dynamicArray.toString());
      // System.out.println("Starting Value : "+dynamicArray.array[0]);
      Main obj = new Main();
      obj.arrays();
   }
   public void arrays() {
      
      // System.out.println(b1);
   }
}