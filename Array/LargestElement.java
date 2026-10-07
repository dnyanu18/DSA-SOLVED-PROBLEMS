package Array;
public class LargestElement {
    public static void findLargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        System.out.println("largest is :" + " " + largest);
    }
    public static void main(String[] args) {
    int arr[]={1,5,2,9,8,3};
    findLargest(arr);     
    }  
}
