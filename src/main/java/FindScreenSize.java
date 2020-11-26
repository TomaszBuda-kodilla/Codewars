public class FindScreenSize {
    public static String find(int width, String ratio) {
        int height = 0;
        String[] numbers = ratio.split(":");
        height = (width * Integer.parseInt(numbers[1])) / Integer.parseInt(numbers[0]);
        return width + "x" + height;
    }
}
