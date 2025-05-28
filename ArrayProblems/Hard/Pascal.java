public class Pascal{
   public long pascalSpecificElement(int row,int col){
      long element = 1;
      for(int i=0;i<col;i++){
         element = element*(row-i);
         element = element/(i+1);
      }
      System.out.println("The element at the given place : "+element);
      return element;
   }
   public static void main(String[] args){

      Pascal obj = new Pascal();
      long element = obj.pascalSpecificElement(5, 2);
   }
}