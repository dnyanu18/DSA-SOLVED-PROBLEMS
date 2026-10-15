package Array;

public class SearchSortedMatrix {

    public static boolean staircaseSearch(int arr[][],int key){
        int row=arr.length-1;
        int col=0;
        while(col < arr.length && row>=0){
            if(arr[row][col] == key){
                System.out.println("found at index" + "(" + row + "," + col + ")");
                return true;
            }
            else if (arr[row][col] > key){
                row--;
            }else{
                col++;
            }
            
            

        }
        System.out.println("key is not found !");
        return false;
    }
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},
                     {15,25,35,45},
                     {27,29,37,48},
                     {32,33,39,50}
    
    };
    int key=33;
    staircaseSearch(arr, key);
    }
    
}
