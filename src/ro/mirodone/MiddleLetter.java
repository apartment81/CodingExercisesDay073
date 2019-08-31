package ro.mirodone;


public class MiddleLetter {

    public String getMiddle(String word) {

      char [] letter = word.toCharArray();

      int len = letter.length;
      int middle = (letter.length)/2;

/*        for (int i = 0; i < len; i++) {
            System.out.println(letter[i]);
        }*/

        if (len % 2 == 0){
                return letter[middle-1] + "" + letter[middle];
        }else {
            return letter[middle]+"";
        }

    }

}
