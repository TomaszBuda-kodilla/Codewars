package kyu_8;

public class Spooner {
    public String spoonerize(String words) {
        int index = words.indexOf(" ");
        char first = words.charAt(0);
        char second = words.charAt(index+1);
        return second+words.substring(1,index+1)+first+words.substring(index+2);
    }
}
