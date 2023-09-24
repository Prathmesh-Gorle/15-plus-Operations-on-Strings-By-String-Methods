public class F_Palindromic_String {
    public static void main(String[] args) {
    String Original="nayan";
    char st1[]=Original.toCharArray();
    int n=Original.length();
    String rev="";
        for(int i=n-1;i>=0;i--){
            //rev =rev+Original.charAt(i);
            rev=rev+st1[i];
        }
       System.out.println(rev);
        //String reverse=new String(rev);  no need to convert it into the string
        if(Original.equals(rev)){
            System.out.println("It is an Palindromic String");
        }else {
            System.out.println("IT is not an Plaindromic String");
        }
    }
}
