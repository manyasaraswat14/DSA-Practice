class SubArray{
public static void GetSubArray(int arr[]){
    for(int i=0; i<arr.length;i++){ //O(n^3)
        int start=i;
        for(int j=i;j<arr.length;j++){
            int end=j;
            for(int k=start;k<=end;k++){
                System.out.print("{"+ arr[k]+"}");
            }
            System.out.println();
        }
        System.out.println();
    }

}
public static void main(String[] args){
  int arr[]={2,4,6,8,10};
  GetSubArray(arr);
  }
}