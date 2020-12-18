public class PascalTriangle {
    public static long[] generate(int level) {
        int arrayLength = 0, place =0;
        for (int l=0;l<=level;l++){
            arrayLength+=l;
        }
        long[] array = new long[arrayLength];

        for(int line = 1; line <= level; line++)
        {
            int value = 1;
            for(int i = 1; i <= line; i++)
            {
                array[place]=value;
                value = value * (line - i) / i;
                place++;
            }
        }
        return array;
    }
}
