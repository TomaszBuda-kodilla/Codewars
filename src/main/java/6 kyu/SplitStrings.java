public class SplitStrings {
    public static String[] split(String myWord) {
        if (myWord.length()%2!=0) myWord+="_";
        String[] array = myWord.split("(?<=\\G.{2})");
        return array;
    }
}
