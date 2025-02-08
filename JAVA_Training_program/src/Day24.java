import java.util.*;

public class Day24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String a = s.replace(" ","");
        char[] ch = a.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        int n = ch.length;
        for(int i = 0;i<n;i++){
            int count = 0;
            if(map.containsKey(ch[i])){
                count = map.get(ch[i]);
            }
            map.put(ch[i],count+1);
        }
        System.out.println("The frequency of each character in the string is: ");
        System.err.println(map);
    }
}