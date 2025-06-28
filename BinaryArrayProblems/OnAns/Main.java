public class Main{
   public static void main(String []agrs){
      Problem pobj = new Problem();

      //Squart of the given number is;

      pobj.squrtOfNumber(2147395599);


      //Find the NthRoot of m;
      System.out.println("The Nth root of M is. : "+pobj.nthRootOfM(3,8));

      //Aggresive Cows
      int cowsCord [] = {0,3,4,7,9,10};
      int cows = 4;
      System.out.println( "The Min of max distance is : "+pobj.aggresiveCowsMinOfMaxDistance(cowsCord,cows));
   }
}