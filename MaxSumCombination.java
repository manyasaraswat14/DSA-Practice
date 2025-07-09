import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxSumCombination {
    public static ArrayList<Integer> topKSumPairs(int[] a, int[] b, int k) {
      ArrayList<Integer>ans= new ArrayList<>();
      
      for(int i=0;i<a.length;i++){
        int sum=a[0]+b[i];
         ans.add(sum);
        sum=0;
      }
      for(int i=0;i<b.length;i++){
        int sum=a[1]+b[i];
        ans.add(sum);
        sum=0;
      }
      Collections.sort(ans, Collections.reverseOrder());
       for (int i = 0; i < k && i < ans.size(); i++) {
            ans.add(ans.get(i));
           
        }
   

    while (ans.size() > k) {
    ans.remove(0);
    }
     
    
      return ans;

    }

    public static void main(String[] args){
      int a[]={1,4,2,3};
      int b[]={2,5,1,6};
     System.out.println( topKSumPairs(a,b,3));
    }
}
