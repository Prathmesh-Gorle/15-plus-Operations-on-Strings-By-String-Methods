import java.util.Arrays;
import java.util.Scanner;

/*Two strings are called anagrams if they contain same set of characters but in different order.
ex.Keep and Peek are anagrams
MotherInLaw and HitlerWoman are anagrams
 */
public class A_Anagrams {
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            String str1=in.nextLine();
            String str2=in.nextLine();

            str1= str1.toLowerCase();
            str2= str2.toLowerCase();

            char[] arr1=str1.toCharArray();
            char[] arr2=str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            String snew=new String(arr1);
            String snew2=new String(arr2);
            if((snew).equals(snew2)){
                System.out.println("It is an Anagram");
            }else{
                System.out.println("It is not an Anagram");
            }
        }
}
