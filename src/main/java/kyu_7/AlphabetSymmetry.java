package kyu_7;

public class AlphabetSymmetry {
    public static int[] solve(String[] arr) {
        for (int k=0;k< arr.length;k++){
            arr[k]=arr[k].toUpperCase();
        }
        int[] result = new int[arr.length];
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length();j++){
                if ((int)arr[i].charAt(j)==65+j)
                {
                    result[i]++;
                }
            }
        }
        return result;
    }
}
