import java.util.jar.Manifest;

public class LongestPalindrome{
    public int longestPalindrome(String s) {
        //! Case sensitive
        int count = 0;
        HashSet<Character> data = new HashSet<Character>();
        for (int i = 0; i < s.length(); i ++) {
            //! For a palindrome string we need to have partnered letters and a unique center
           // NITIN -- N&N are partners
           // I&I are partners
           // T is a unique center
           //ToDo We are just concerned with the maximum length possible and rearrangement of characters is
           //ToDo possible
            char c = s.charAt(i);
            if (data.contains(c)) {
                count += 2;
                data.remove(c);
            }
            else {
                data.add(c);
            }
        }
        if (data.size() > 0) {
            count ++;
        }
        return count; 

    }
}