public class I_ReverseStringbytocharMethod {
    public static void main(String[] args) {
        String pg="Nayan";
        char st[]=pg.toCharArray();
        int n=pg.length();
        for(int i=n-1;i>=0;i--){
            System.out.print(st[i]);
        }
    }
}
