public class D_CountthesumofnumberintheString {
    public static void main(String[] args) {
        String countsum="4prepinsta48hdg";
        char cs[]=countsum.toCharArray();
        int s=countsum.length();
        int sum=0;

          String n1= countsum.substring(0,1);
       // System.out.println(n1);
          String n2=countsum.substring(10,11);
       // System.out.println(n2);
          String n3=countsum.substring(11,12);
       // System.out.println(n3);
          int n11=Integer.parseInt(n1);
          int n12=Integer.parseInt(n2);
          int n13=Integer.parseInt(n3);
          sum=n11+n12+n13;

        System.out.println("Sum of all digits are "+sum);

    }
}
