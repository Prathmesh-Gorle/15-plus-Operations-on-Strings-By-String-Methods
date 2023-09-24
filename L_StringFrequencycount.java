
import java.util.Arrays;

public class L_StringFrequencycount {
    public static void main(String[] args) {
        String FC="Fergusion College";
        char a [] = FC.toCharArray();
        Arrays.sort(a);
        int n = a.length;
        for(int i=0; i<n;i++){
            int count=1;
            if(a[i]==' '){               //for not counting the space
                continue;
            }
            while( i < n-1 && a[i] == a[i+1] ){
                i++;
                count++;
            }
            System.out.println(a[i] +" : "+ count);

          /* if(count==1){
                System.out.print(a[i]);
            }     //FOR PRINTING NON-Repeating elements*/
        }
    }
}
