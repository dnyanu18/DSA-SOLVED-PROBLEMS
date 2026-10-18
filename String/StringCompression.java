package String;

public class StringCompression {
    public static int compress(char[] chars){
        int n=chars.length;
        int idx=0;
        for(int i=0;i<n;i++){
            char ch=chars[i];
            int count=0;
            while(i<n && chars[i]==ch){
                count++;
                i++;
            }
            if(count==1){
                chars[idx]=ch;
                idx++;
            }else{
                chars[idx]=ch;
                idx++;
                String str=String.valueOf(count);
                for (char dig : str.toCharArray()) {
                    chars[idx]=dig;
                    idx++;
                    
                }
            }
            i--;

        }
        for(int i=0;i<idx;i++){
            System.out.print(chars[i]);
        }
        System.out.println();
        return idx;
        
    }
    public static void main(String[] args) {
        char[] chars={'a','b','b','b'};

        System.out.println(compress(chars));
        
    }
}
