public class C_CheckwhetherAlphabetornot {
    public static void main(String[] args) {
        String alphnum = "Prathmesh@123*!#$12";
        char an[] = alphnum.toCharArray();
        int m = alphnum.length();
        for (int i = 0; i < m; i++) {
            if ((an[i] >= 97 && an[i] <= 122) || (an[i] >= 65 && an[i] <= 90)) {
                System.out.println(an[i] + " It is an alphanumeric");
            }
            if (an[i] == '!' || an[i] == '@' || an[i] == '#' || an[i] == '$' || an[i] == '*') {
                System.out.println(an[i] + " It is an special character");
            }

            if (an[i] == '1' || an[i] == '2' || an[i] == '3' || an[i] == '4' || an[i] == '5') {
                System.out.println(an[i] + " It is an numeric character");
            }

        }
    }
}
