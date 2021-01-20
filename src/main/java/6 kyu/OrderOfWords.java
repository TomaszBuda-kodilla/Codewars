public class OrderOfWords {
    public static String order(String words) {
        int number = 0;
        String[] array = words.split(" ");
        String[] arraySorted = new String[array.length];
        number= Integer.parseInt(array[0].replaceAll("[^\\d]", ""));
        for (int i = 0; i < array.length; i++) {
            number= Integer.parseInt(array[i].replaceAll("[^\\d]", ""));;
            arraySorted[i] = array[number-1];
        }
        return String.join(" ", arraySorted);
    }
}
