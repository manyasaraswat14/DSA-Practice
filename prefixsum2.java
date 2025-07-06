public class prefixsum2 {
    public static int cntSubarrays(int[] arr, int k) {
        // code here
        int ans[]= new int[arr.length];
        ans[0]=arr[0];
        int count=0;
        for(int i=1;i<arr.length;i++){
           ans[i]=ans[i-1]+arr[i];
           if(ans[i]==k){
               count++;
           }
        }
        return count;
    }
    public static void main(String[] args) {
         int arr[]={9, 4, 20, 3, 10, 5};
         int k = 33;
         System.out.println(cntSubarrays( arr, k));
    }
}
