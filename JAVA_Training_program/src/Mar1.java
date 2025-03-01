import java.util.*;

public class Mar1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        if (isAutobiographical(str)) {
            System.out.println("Autobiographical");
        } else {
            System.out.println("Not Autobiographical");
        }
    }

    public static boolean isAutobiographical(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }else{
                map.put(c, 1);
            }
        }
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            int expectedCount = Character.getNumericValue(c);
            if (expectedCount < 0 || expectedCount > str.length() - 1 || map.getOrDefault((char) ('0' + i), 0) != expectedCount) {
                return false;
            }
        }
        return true;
    }
}