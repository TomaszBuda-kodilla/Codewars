public class StringsExercise {
    public static boolean solution(String str, String ending) {
        if (str.endsWith(String.valueOf(ending)))
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String myString = "jsdgsg";
        String ending = "sgg";
        boolean result;

        result = StringsExercise.solution(myString,ending);
        System.out.println("Result is " + result);
    }
}

