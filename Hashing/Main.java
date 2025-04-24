import java.util.*;

public class Main{
   public static void main(String[]args){


      // FrequencyProgram obj = new FrequencyProgram();
      // obj.frequencyOfNumberExample();
      // obj.frequencyofCharInStringOnlyLowerCaseAlphabets();
      // obj.frequencyofCharInString();

      //HashMap learning.
      Map<String,Integer> hashObj = new HashMap<>();
      hashObj.put("NagarajS",100);
      hashObj.put("Arjun",20);
      hashObj.put("deva",20);

      System.out.println(hashObj.containsValue(20));
      System.out.println(hashObj);
   }  
}