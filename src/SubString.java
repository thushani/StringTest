import java.util.TreeSet;

/**
 * <h1>Sub String Manipulation!</h1>
 * The SubString program implements an application that gives the substring operation functionality
 * @author Thushani
 * @since 2023-02-16
 */
public class SubString {
    final static int ZERO_LENGTH = 0;
    /**
     * This function returns the maximum length of the substring of the given string
     * @param s This is the input string
     * @return int This the maximum length of the substring
     */
    public int longestSubString(String s){
        if (s == null) return -1;                                    // Check input string is null or not
        else if(s.length() == 0) return 0;                           // Check input string is empty or not
        s = s.toLowerCase();                                         // Remove case sensitivity
        s = s.replaceAll(" ","");                   // Remove spaces

        StringBuilder subString = new StringBuilder();               // Create mutable string
        TreeSet<Integer> subStringLen = new TreeSet<>();             // Create Tree Set

        int counter = 0;
        int i = 0;

        while(i<s.length()){
            char c = s.charAt(i);
            if(!subString.toString().contains(String.valueOf(c))){   // Create substring without duplicate characters
                subString.append(c);
                i++;
            }
            else{                                                    // When found duplicate character,
                subStringLen.add(subString.toString().length());     // Add the length of the substring to the Tree Set
                subString.setLength(ZERO_LENGTH);                    // make substring empty
                counter++;
                i = counter;                                         // Restart the loop to find next substring
            }

        }
        return subStringLen.last();                                  // Return the last element of the Tree set as
                                                                     // maximum length of the substrings set
    }
}
