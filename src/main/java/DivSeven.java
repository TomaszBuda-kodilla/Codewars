class DivSeven {
    public static long[] seven(long number) {
        long[] result= new long[]{0,0};
        while(number > 99){
            long numberDiv = number%10;
            number=(number-numberDiv)/10-2*numberDiv;
            result[0] = number;
            result[1]++;
        }
        return result;
    }
}
