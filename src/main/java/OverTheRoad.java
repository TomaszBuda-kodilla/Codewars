public class OverTheRoad {
    public static long overTheRoad(long address, long n) {
        long[] leftSort = new long[(int)n];
        leftSort[0] = 1;
        long[] rightSort = new long[(int)n];
        rightSort[0] = n*2;
        long result=0;
        for (int i=1;i<n;i++){
                leftSort[i]=leftSort[i-1]+2;
                rightSort[i]=rightSort[i-1]-2;
        }
        for (int j=0;j<n;j++)
        if (address%2 == 0)
        {
            if (rightSort[j]==address)
            {
                result = leftSort[j];
            }
        } else {
            if (leftSort[j]==address)
            {
                result = rightSort[j];
            }
        }
        return result;
    }
}
