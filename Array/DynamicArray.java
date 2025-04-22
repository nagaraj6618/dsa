public class DynamicArray {

   int size;
   int capacity = 10;
   Object[] array;
   public DynamicArray(){
      this.array = new Object[capacity];
   }
   public DynamicArray(int capacity){
      this.capacity = capacity;
      this.array = new Object[capacity];
   }


   public String toString(){
      String string = "";
      for(int i=0;i<capacity;i++){
         string += array[i]+", ";
      }
      return string;
   }
   public boolean isEmpty(){
      return size == 0;
   }
   public int sizeOf(){
      return size;
   }
   public void insert(int index,Object data){
      if(size == capacity){
         grow();
      }
      // for(int i=size ; i>index ; i--){
      //    array[i] = array[i-1];
      // }
      for(int i=size-1 ;i>=index;i--){
         array[i+1] = array[i];
      }
      array[index] = data;
   }
   public void add(Object data){
      if(size == capacity){
         grow();
      }
      this.array[size] = data;
      size++;
   }
   public void delete(int index){
      if(size-1<=index){
         System.out.println("No Item found to delete at index "+index);
      }
      else{
         for(int i=index;i<size;i++){
            array[i] = array[i+1];
         }
         size--;
         shrink();
      }
   }
   public void search (){

   }
   private void grow(){
      int newCapacity = (int)(capacity*2);
      Object[] newArray = new Object[newCapacity];
      for(int i=0;i<size;i++){
         newArray[i] = array[i];
      }
      this.array = newArray;
      this.capacity = newCapacity;
   }
   private void shrink(){
      int newCapacity = (int)(capacity/2);
      Object[] newArray = new Object[newCapacity];
      for(int i=0;i<size;i++){
         newArray[i] = array[i];
      }
      this.array = newArray;
      this.capacity = newCapacity;
   }
}