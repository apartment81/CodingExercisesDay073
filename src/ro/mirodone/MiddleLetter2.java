package ro.mirodone;

public class MiddleLetter2 {

    public  String getMiddle(String word) {
        String s ;
        int length = word.length();
        int half = length / 2;

        if (length % 2 == 0) {
            s = word.substring(half-1, half +1);
        } else {
            s = word.substring(half, half + 1);
        }
        return s;
    }


}
