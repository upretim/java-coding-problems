import java.util.HashSet;
import java.util.Set;

public class ValidString {
    /*
    * Sherlock considers a string to be valid if all characters of the string appear the same number of times.
    *  It is also valid if he can remove just  character at  index in the string, and the remaining characters
    *  will occur the same number of times. Given a string , determine if it is valid. If so, return YES,
    * otherwise return NO.

For example, if , it is a valid string because frequencies are .
* So is  because we can remove one  and have  of each character in the remaining string.
* If  however, the string is not valid as we can only remove  occurrence of .
* That would leave character frequencies of .*/
    public static void main(String[] args) {
        System.out.println(isValidString("ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd"));
    }
   private static String isValidString(String s) {
        Set<Character> charSet = new HashSet<>();
        Set<Integer> intSet = new HashSet<>();
        for(int i=0;i<s.length();i++)
            charSet.add(s.charAt(i));
        int num =0, k=0;
        boolean firstIteration = true;
        int uniqueValue1 =0, uniqueValue1Counter=0;
        int uniqueValue2 =0, uniqueValue2Counter=0;
        for(Character ch: charSet){
            num =0;
            k=0;
            while(k<s.length()){
                if(s.charAt(k)==ch) {
                    num++;
                }
                k++;
            }
            System.out.println("Num is "+ num);
            if(firstIteration){
                uniqueValue1 = num;
                uniqueValue1Counter++;
            }
            else if(num==uniqueValue1){
                uniqueValue1Counter++;
            }
            else if(num==uniqueValue2){
                uniqueValue2Counter++;
            }
            else {
                uniqueValue2 = num;
                uniqueValue2Counter++;
            }
            if(uniqueValue1>0 && uniqueValue2>0){
                if((Math.abs(uniqueValue1-uniqueValue2))>1)
                    return "NO";
            }

             if(uniqueValue1Counter>1 && uniqueValue2Counter>1)
                 return "NO";
              intSet.add(num);

              if(intSet.size()>2)
                return "NO";
            firstIteration = false;
        }
       return "YES";
    }
}
