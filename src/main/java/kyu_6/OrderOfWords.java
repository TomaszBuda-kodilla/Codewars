package kyu_6;

public class OrderOfWords {
    public static String order(String words) {
        if (words == null) return "";
        if (words == "") return "";
        int number = 0;
        String[] array = words.split(" ");
        String[] arraySorted = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            number = Integer.parseInt(array[i].replaceAll("[^\\d]", ""));
            arraySorted[number - 1] = array[i];
        }
        return String.join(" ", arraySorted);
    }
}
