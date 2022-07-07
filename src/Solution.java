import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n){
        List<String> ans = new ArrayList<>();

//        create the hashmap
        HashMap<Integer, String> theDict = new HashMap<>();
        theDict.put(3, "Fizz");
        theDict.put(5, "Buzz");

//        create the divisor
        List<Integer> divisor = new ArrayList<>(Arrays.asList(3, 5));

        for(int num=1; num<=n; num++){
            String numAnsStr = "";
            for (Integer key: divisor
                 ) {
                if (num % key == 0){
                    numAnsStr += theDict.get(key);
                }
            }
            if (numAnsStr.equals("")){
                numAnsStr += Integer.toString(num);
            }
            ans.add(numAnsStr);
        }
        return ans;
    }
}