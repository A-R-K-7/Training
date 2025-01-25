import java.util.Scanner;

public class Day13 {

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        int testcases = sc.nextInt();
        int[][] arrays = new int[testcases][];
        for (int i = 0; i < testcases; i++) {
            System.out.print("");
            int size = sc.nextInt();
            arrays[i] = new int[size];
            for (int j = 0; j < size; j++) {
                arrays[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for(int x = 0;x<testcases;x++){
            int result = findEquilibriumIndex(arrays[x]);
            System.out.println(result);
        }
    }

    public static int findEquilibriumIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int x = 0; x < i; x++) {
                
                leftSum += arr[x];
            }

            for (int y = i+1; y<arr.length;y++){
                
                rightSum += arr[y];
            }
            if(leftSum==rightSum){
                return i;
            }
        }
        return -1;
    }
}