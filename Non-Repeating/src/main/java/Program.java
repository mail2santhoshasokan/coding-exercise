import java.util.HashMap;

public class Program {
    public static int firstNonRepeatingCharacter(String string) {
        HashMap<Character, Integer> integerHashMap = new HashMap<>();
        for (int i=0;i<string.length();i++){
            char c = string.charAt(i);
            integerHashMap.put(c,integerHashMap.getOrDefault(c,0)+1);
        }

        for (int j=0;j<string.length();j++){
            char c = string.charAt(j);
            if (integerHashMap.get(c) == 1){
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingCharacter("faadabcbbebdf"));
    }
}
