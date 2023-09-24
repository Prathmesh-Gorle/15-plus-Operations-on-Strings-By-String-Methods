
public class N_ToggleCharcterbyReplaceMethod {
    public static void main(String[] args) {
        String pg = "Prathmesh Gorle";
        char g[] = pg.toCharArray();
        int m = pg.length();
      //Without Using Replace Method
       /*for (int i = 0; i < m; i++) {
            if (g[i] >= 65 && g[i] <= 90) {
                char ch = (char) (g[i] + 32);     //here we adding some integer value thats we have speicfy
                System.out.print(ch);
            } else {
                char ch = (char) (g[i] - 32);
                System.out.print(ch);
            }
        }*/
        String psg= pg.replace("Prathmesh Gorle","pRATHMESH gORLE" );
        //String psg1= pg.replace("Gorle","gORLE" );
        System.out.println(psg);
    }
}
