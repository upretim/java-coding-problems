public class ReverseWords {
    public static void main(String[] args) {
        reversedWords("I,am,Indian");
    }
    private static String reversedWords(String str){
        String [] words = str.split(",");
        String [] revWords = new String[words.length];
        for(int i=0;i<words.length;i++){
            revWords[i]  = String.valueOf(reverseStrBuffer(new StringBuffer(words[i])));
            System.out.print(words[i] +" ");
            System.out.println("\n");
            System.out.print(revWords[i] +" ");
        }
        return str;
    }

    private static StringBuffer reverseStrBuffer(StringBuffer str){
        return str.reverse();
    }


}
