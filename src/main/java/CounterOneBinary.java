public class CounterOneBinary {
    public int countOnes(int A, int B) {
        int counter = 0;
        int number = A * B;
        String binary = Integer.toBinaryString(number);
        char numberOne = '1';
        for (int i = 0; i < binary.length(); i++) {
            numberOne = binary.charAt(i);
            if (numberOne == '1') {
                counter++;
            }
        }
        return counter;
    }
}
