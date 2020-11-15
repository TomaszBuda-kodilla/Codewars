public class GetTheMeanOfArray {
    public static int getAverage(int[] marks){
        int result = 0;
        for(int i=0;i< marks.length;i++)
        {
            result = (result+marks[i]);
        }
        System.out.println("Your average is: " + result/ marks.length);
        return result/ marks.length;
    }
    public static void main(String[] args) {
        int[] marks = new int[]{2,2,2,2};
        GetTheMeanOfArray.getAverage(marks);
    }
}
