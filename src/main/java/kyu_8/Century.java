package kyu_8;

public class Century {
    public static int century(int number) {
        return number%100 != 0 ? number/100+1 : number/100;
    }
}
