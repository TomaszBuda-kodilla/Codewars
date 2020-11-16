public class Automorphic {
    public static String autoMorphic(int number) {
        String result = Integer.toString(number * number);
        if (result.endsWith(String.valueOf(number))) {
            return "Automorphic";
        } return "Not!!";
    }

    public static void main(String[] args) {
        int number = 5;
        Automorphic.autoMorphic(number);
    }
}
