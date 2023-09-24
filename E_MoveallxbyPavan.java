public class E_MoveallxbyPavan {
    public static void main(String[] args) {
        String MX = "axbxcxdx";
        char ex[] = MX.toCharArray();
        //System.out.println(ex[2]);
        int n = MX.length();
       
        int count=0;
        for (int i = 0; i < n; i++) {
            if( ex[i] == 'x') {
                count++;
              continue;
            }else
                System.out.print(ex[i]);
        }
       // System.out.println(count);

for(int i=1;i<=count;i++){
    System.out.print('x');
}
    }
}
