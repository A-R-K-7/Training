import java.util.*;


public class Day16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            System.out.printf("Enter element %d: ",i);
            arr[i] = sc.nextInt();
        }
        System.err.println("Given array: "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.print("Enter target element: ");
        int target = sc.nextInt();
        sc.close();
        int floornum = Integer.MIN_VALUE;
        int i = 0;
        while(arr[i]<=target){
            floornum = arr[i];
            i++;
        }
        System.out.printf("Floor of %d is %d",target,floornum);
    }
}
