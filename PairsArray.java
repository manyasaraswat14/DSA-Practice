public class PairsArray {
    public static void getPairs(int arr[]){
        for(int i =0; i<arr.length;i++){ //O(n^2)
            int first=arr[i];
            for(int j=i;j<arr.length;j++){
             int last=arr[j];
             System.out.print("("+first+","+ last+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        getPairs(arr);
    }
}
