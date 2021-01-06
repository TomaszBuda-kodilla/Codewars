import java.util.Scanner;

public class Catalog {
    public static String catalog(String s, String article) {
        String result ="";
        String[] strArr = s.split("<prod>(\\w+)</prod>");
        for (int i=0; i< strArr.length;i++){
            if (strArr[i].contains(article))
            {
                System.out.println("cos");
                Scanner price = new Scanner(strArr[i]).useDelimiter("\\s*<prx>\\s*");
                Scanner qty = new Scanner(strArr[i]).useDelimiter("\\s*<qty>\\s*");
                result+= article + " > prx: $" + price.next() + " qty: " + qty.next();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "";
    }
}
