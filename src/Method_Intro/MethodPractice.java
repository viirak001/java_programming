package Method_Intro;

import java.util.Arrays;

public class MethodPractice {

    private static String[] mySplit(String data, String delimiter){
        return data.split(delimiter);
    }

    public static void main(String[] args) {
        String data = "Hello, World";
        String[] resultOfSplit = mySplit(data, ",");
        System.out.println(Arrays.toString(resultOfSplit));
    }
}
