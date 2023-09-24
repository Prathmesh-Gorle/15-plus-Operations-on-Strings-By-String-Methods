
public class B_Charactervowelornot {
    public static void main(String[] args) {
        String CV= "Simultaneously";
        char cv[]=CV.toCharArray();
        int c= CV.length();
        int count=0;
        for(int i=0;i<c;i++){
            if( cv[i]=='a'||cv[i]=='e'||cv[i]=='i'||cv[i]=='o'||cv[i]=='u'){
                System.out.println(cv[i]+" It is an vowel");
                count++;
            }
        }
        System.out.println("Total Count of vowels in the string is "+count);
    }
}
