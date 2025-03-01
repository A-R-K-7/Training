import java.util.HashMap;

public class feb28 {
    public static void main(String[] args){

    }
    public static int returnLargest(int num){

        HashMap<Integer,Integer> segmentCost = new HashMap<>();
        segmentCost.put(0,6);
        segmentCost.put(1,2);
        segmentCost.put(2,5);
        segmentCost.put(3,5);
        segmentCost.put(4,4);
        segmentCost.put(5,5);
        segmentCost.put(6,6);
        segmentCost.put(7,3);
        segmentCost.put(8,7);
        segmentCost.put(9,5);
        
        int segments = 0;
        while(num!=0){
            segments+=segmentCost.get(num%10);
            num/=10;
        }
        
        return segments;
    }
}

