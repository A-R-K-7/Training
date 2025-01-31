import java.util.*;


public class Day19 {
    @SuppressWarnings("ConvertToTryWithResources")
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

        int floornum = findFloor(arr,target);
        int ceiling = findCeiling(arr,target);

        System.out.printf("Floor of %d is %d",target,floornum);
        System.out.printf("\nCeiling of %d is %d",target,ceiling);
    }

    static int findFloor(int[] arr, int target){
        int floornum = Integer.MIN_VALUE;
        int left = 0; 
        int right = arr.length-1;
        
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]== target){
                return arr[mid];
            }
            else if(arr[mid]<target){
                floornum = arr[mid];
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return floornum;
    }

    static int findCeiling(int[] arr, int target){
        int ceiling = Integer.MAX_VALUE;
        int left = 0;
        int right = arr.length-1;
        
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]== target){
                return arr[mid];
            }
            else if(arr[mid]<target){
                left = mid+1;
            }
            else{
                ceiling = arr[mid];
                right = mid-1;
            }
        }
        return ceiling;
    }
}   

