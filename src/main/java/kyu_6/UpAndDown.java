package kyu_6;

public class UpAndDown {
    public static String arrange(String sentence) {
        String[] array = sentence.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(array[0].toLowerCase());
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() >= array[i - 1].length()) {
                stringBuilder.append(array[i].toUpperCase() +" ");
            } else {
                stringBuilder.append(array[i].toLowerCase() + " ");
            }
        }
        return stringBuilder.toString();
    }
}
