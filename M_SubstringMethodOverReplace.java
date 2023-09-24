
public class M_SubstringMethodOverReplace {
    public static void main(String[] args) {
        String Originalstr="James Gosling";
        char jg[]=Originalstr.toCharArray();
        int n=Originalstr.length();

        String sub =Originalstr.substring(5);
        System.out.println(sub);

        String se=sub.toLowerCase();
        System.out.println(Originalstr.substring(0,5)+se);


        //(only for Capital M) if Replace method is not remember
        String c1=Originalstr.substring(0,2);
        String c2 =Originalstr.substring(2,3);
        String c3=c2.toUpperCase();
        String c4=Originalstr.substring(3);
        System.out.println(c1+c3+c4);

        //By Method using
        String pm=Originalstr.replace("James Gosling","JaMes Gosling");
        System.out.println(pm);

    }
}
