package Array;

public class TwoSum {
    public static void  twoSum(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.print("["+i+","+j+"]");
                    System.out.println();
                    return;
                }
            }
        }
        System.out.println("Not Found");
        
    }
    public static void main(String[] args) {
        int arr[]={3,2,4};
        int target=5;
        twoSum(arr, target);
    }
}
