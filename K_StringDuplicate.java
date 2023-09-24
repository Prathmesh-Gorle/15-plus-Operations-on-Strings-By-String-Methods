
import java.util.Arrays;

public class K_StringDuplicate {
    public static void main(String[] args) {
        String str = "PPavanGorle";
        char [] ch=str.toCharArray();
        
        int n =str.length();
        
        Arrays.sort(ch);               //sorting is needed first

        for(int i=0;i<n;i++){
            int count =1;
            while(i<n-1 && ch[i]==ch[i+1]){    //if here we not using While loop then we have to use another for loop with if condition
                //System.out.println(ch[i]);
                i++;
                count++;

            }
            //System.out.println(ch[i]+" : "+count);
            if(count>1){
                System.out.print(ch[i]);
            }
        }
    }
}
