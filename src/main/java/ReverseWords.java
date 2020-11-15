public class ReverseWords {
    public static String reverseWords(String str) {
        String[] words = str.split(" ", 0);
        int range = words.length - 1;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < words.length; i++) {
            if (range == 0) {
                sb.append(words[range]);
                range--;
            } else {
                sb.append(words[range] + " ");
                range--;
            }
        }
        String result = sb.toString();
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        String str = "I like eating";
        ReverseWords.reverseWords(str);
    }
}
