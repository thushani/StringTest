import java.util.*;

public class Main {

    public static int longest_sub_string(String s){
        s = s.toLowerCase();
        StringBuilder subString = new StringBuilder();

        Map<String,Integer> subStringDict = new HashMap<>();
        for(char c: s.toCharArray()){
            if(!subString.toString().contains(String.valueOf(c))){
                subString.append(c);
            }
            else{
                subStringDict.put(subString.toString(),subString.toString().length());
                subString.setLength(0);
                subString.append(c);
            }
        }
        Optional<Integer> max = subStringDict.values().stream().max(Integer::compare);
        return max.orElse(0);

    }


    public static void main(String[] args) {
        int out = longest_sub_string("abcabcbb");
        System.out.println(out);
    }
}