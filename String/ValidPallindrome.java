package String;

public class ValidPallindrome {
    public static boolean isPalindrome(String str){
        str=str.toLowerCase().replaceAll("[^a-z0-9]", "");
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="racecaR";
        System.out.println(isPalindrome(str));
    }
}
