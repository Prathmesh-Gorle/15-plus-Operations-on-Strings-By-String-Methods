public class H_RemoveSpecialchar {
    public static void main(String[] args) {
        String RS="$G*I;T..H, 1U'^?B";
        char r[]=RS.toCharArray();
        int n=RS.length();

        for(int i=0;i<n;i++){
            if(r[i]<'A'||r[i]>'Z' && r[i]<'a'||r[i]>'z'){      //here, AND operation is there thats why one charcter can't be Small as well as capital.
               continue;            //enter Only Special Charcter and digits and spaces
            }
            System.out.print(r[i]);
        }

    }
}
