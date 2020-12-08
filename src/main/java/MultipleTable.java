public class MultipleTable {
    public static String multiTable(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=1; i<11;i++){
            if (i<10)stringBuilder.append(i +" * " + num + " = " + i*num + "\n");
            else stringBuilder.append(i +" * " + num + " = " + i*num);
        }
        return stringBuilder.toString();
    }
}

/* To avoid last "Enter" u can use statement stringBuilder.toString().trim(); instead of 'if' */

/* Other example of this method using stream

public static String multiTable(int num) {
        return IntStream.rangeClosed(1, 10)
          .mapToObj(i -> i + " * " + num + " = " + i * num)
          .collect(Collectors.joining("\n"));
    }
 */