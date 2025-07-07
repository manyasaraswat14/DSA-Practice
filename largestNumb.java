import java.util.Arrays;

public class largestNumb {
    public static int largest(int arr[]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(large<arr[i]){              //O(n)
                large=arr[i];
            }
        }
        return large;
    }
             //or for a better TC
    public static int large(int arr[]){
        int ans=-1;
        Arrays.sort(arr);     //Time Complexity: O(n log n)
                             //Because Arrays.sort() uses a Dual-Pivot QuickSort for primitives, which is O(n log n) in the average case.
        int n=arr.length;
        ans= arr[n-1];

     return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(largest(arr));
        System.out.println(large(arr));
    }
}
