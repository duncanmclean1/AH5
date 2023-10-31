import java.util.HashMap;
import javax.xml.transform.Source;

class Solution {
  public static char mostFrequentChar(String s) {
    // Required variables
    char ans = ' ';
    int l = s.length();
    int count = 0;

    // HashMap for frequency of each character in the String
    HashMap<Character, Integer> hm = new HashMap<>();

    // Iterate through the entire String
    for (int i = 0; i < l; i++) {

      // Temp variable to store current character
      char temp = s.charAt(i);

      // Put current character into the HashMap and increases its frequency
      hm.put(temp, hm.getOrDefault(temp, 0) + 1);

      // Checks and updates the current answer as well as the current count
      // then checks if two characters have the same frequency
      // returns the one that appears earlier in the string
      if (count < hm.get(temp)) {
        ans = temp;
        count = hm.get(temp);
      } else if (count == hm.get(temp) && s.indexOf(temp) < s.indexOf(ans)) {
        ans = temp;
      }

    } // for i

    // Returns the most frequent character
    return ans;

  }// mostFrequentChar

  public static void main(String[] args) {
    // Try out your test cases:
    System.out.println(Solution.mostFrequentChar("bookeeper")); // -> 'e'
    System.out.println(Solution.mostFrequentChar("david")); // -> 'd'
    System.out.println(Solution.mostFrequentChar("mississippi")); // -> 'i'
    System.out.println(Solution.mostFrequentChar("eleventennine")); // -> 'e'
  }

}
