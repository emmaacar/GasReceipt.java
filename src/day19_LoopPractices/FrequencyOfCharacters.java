package day19_LoopPractices;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aabbccd";
        String result ="";   // a2b1c3d1

        char ch = str.charAt(0); //a
        int count = 0;

        for (int j = 0;j < str.length(); j++) {  // to found to frequency of each character

            char each =str.charAt(j);   // each character of str
            if (ch==each){
                count++;

            }
            System.out.println(count);
        }
    }
}
