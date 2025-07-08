public class sumSubArray {
    public static int sum(int arr[]){
        int n= arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
         sum+= arr[i]*(i+1)*(n-i);
        }
        return sum;
    }
    public static void main(String[] args){
      int arr[]={1,4,5,3,2};
      System.out.println(sum(arr));
    }
    
}
