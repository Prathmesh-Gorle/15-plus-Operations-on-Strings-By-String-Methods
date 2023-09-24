public class G_RemoveSpacesFromString {
    public static void main(String[] args) {
        String RS="Ram is in Pune";
        char sita[]=RS.toCharArray();
        int R=RS.length();
        for(int i=0;i<R;i++){
            if(sita[i]!=' '&& sita[i]!='\t'){                     //! = not equal to
                System.out.print(sita[i]);
            }
        }
    }
}
