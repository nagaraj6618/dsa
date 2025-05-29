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

   public void printNthRow(int N){
      long ans = 1;
      System.out.print("The Elements in the Nth Row is : ");
      System.out.print(ans+" ");
      for(int i=1;i<N;i++){
         ans = ans *(N-i);
         ans = ans/i;
         System.out.print(ans+ " ");
      }
      System.out.println();
   }
   public void printEntirePascal(int N){
      for(int i=0;i<N;i++){
         int ans = 1;
         System.out.print(ans+" ");
         for(int j=1;j<=i;j++){
            ans = ans*(i-j+1);
            ans = ans/j;
            System.out.print(ans+ " ");
         }
         System.out.println();
      }
   }
   public static void main(String[] args){

      Pascal obj = new Pascal();
      long element = obj.pascalSpecificElement(5, 2);
      obj.printNthRow(6);
      obj.printEntirePascal(6);
   }
}