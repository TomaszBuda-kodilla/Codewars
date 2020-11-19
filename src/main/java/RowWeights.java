public class RowWeights {
    public static int[] counter(final int[] array) {
        int[] teams = new int[2];
        for (int i = 0; i < array.length; i++) {
            if ((i % 2) == 0) teams[0] += array[i];
            else teams[1] += array[i];
        }
        System.out.println(teams[0] + " - " + teams[1]);
        return teams;
    }
}
