public class ReverseString {
    private static String reverseString(String word) {
        char[] letters = new char[word.length()];
        int range = word.length()-1;
        for (int i = 0; i < word.length(); i++) {

            letters[i] = word.charAt(range);
            range--;
        }
        System.out.println(letters);
        return "";
    }

    public static void main(String[] args) {
        String word = "abcdef";
        ReverseString.reverseString(word);
    }
}
