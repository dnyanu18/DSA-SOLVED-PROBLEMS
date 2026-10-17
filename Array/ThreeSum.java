package Array;
import java.util.*;
public class ThreeSum {
    public List<List<Integer>> threeSum(int arr[]){
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            int L=i+1;
            int R=arr.length-1;
            while(L<R){
                int sum=arr[i]+arr[L]+arr[R];
                if(sum==0){
                    List<Integer> triplet=new ArrayList<>();
                    triplet.add(arr[i]);
                    triplet.add(arr[L]);
                    triplet.add(arr[R]);

                    result.add(triplet);
                    while(L<R && arr[L]==arr[L+1]){
                        L++;
                    }
                    while(L<R && arr[R]==arr[R-1]){
                        R--;
                    }
                    L++;
                    R--;
                }else if(sum<0){
                    L++;
                }else{
                    R--;
                }
            }

        }
        return result;

    } 
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        ThreeSum obj=new ThreeSum();
        System.out.println(obj.threeSum(arr));
        
    }
}
