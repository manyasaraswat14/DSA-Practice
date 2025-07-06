import java.util.*;
public class BinarySearch {
    public static int search(int arr[],int key){
        int n=arr.length;
        int start=0;
        int end=n-1;

        while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;
            } else if(arr[mid]<key){
                start=mid+1;
            }
            
        }
        return -1;

    }
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in) ;
       System.out.println("Enter size of array:");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter Elements:");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       System.out.println("------Array:-----");
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+",");
       }
       System.out.println();
       System.out.println("Enter key to search :");
       int key= sc.nextInt();

       System.out.println("Key found at index :"+ search(arr, key));

    }
}
