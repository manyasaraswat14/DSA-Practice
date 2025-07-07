class smallestNumb {
    public static int getSmallest(int arr[]){
        int small=Integer.MAX_VALUE;
        for(int i=0; i<arr.length;i++){
            if(small>arr[i]){
                small=arr[i];
            }
        }
        return small;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        System.out.println(getSmallest(arr));
    }
}
