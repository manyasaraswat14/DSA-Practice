class Prefixsum{
public static int[] sum(int arr[]){
for(int i=1; i<arr.length;i++){
    arr[i]=arr[i-1]+arr[i];
}
return arr;
}
public static void print(int arr[]){
    for(int i=0; i<arr.length;i++){
        System.out.print(arr[i]+",");
    }
}
public static void main(String[] args) {
   int num[]={1,2,3,4,5};
   sum(num);
   print(num);
}
}