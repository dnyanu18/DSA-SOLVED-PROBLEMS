package Array;
import java.util.Scanner;;
public class MergeArrays {
    public static void merge(int nums1[],int m,int nums2[],int n){
        int r1=m-1;
        int r2=nums2.length-1;
        int w=m+n-1;
        while(w>=0){
            while(r1>=0 && r2>=0){
                if(nums1[r1]>=nums2[r2]){
                    nums1[w]=nums1[r1];
                    w--;
                    r1--;
                }else{
                    nums1[w]=nums2[r2];
                    w--;
                    r2--;
                }
            }
            while(r1>=0){
                nums1[w]=nums1[r1];
                    w--;
                    r1--;
            }
            while(r2>=0){
                nums1[w]=nums2[r2];
                    w--;
                    r2--;
            }
        }
        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums1[]=new int[6];//[1,2,3,0,0,0]
        int nums2[]=new int[3];//[4,5,6]
        int m=3;
        int n=3;
        System.out.println("Enter nums1:");
        for(int i=0;i<nums1.length;i++){
            nums1[i]=sc.nextInt();
            
        }
        
        System.out.println("Enter no.2:");
        for(int i=0;i<nums2.length;i++){
            nums2[i]=sc.nextInt();
            
        }
        
        merge(nums1, m, nums2, n);

    }
}
