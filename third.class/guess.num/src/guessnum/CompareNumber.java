package guessnum;

public class CompareNumber {

    String compareNumber(String anwser, String userInput){
        String result="";
        int aNum = 0, bNum = 0;
        for(int i=0; i<4; ++i){
            if(anwser.charAt(i) == userInput.charAt(i)) {
                aNum++;
            }
            else if(anwser.contains(String.valueOf(userInput.charAt(i)))){
                bNum++;
            }
        }
        result = String.valueOf(aNum) +"A"+String.valueOf(bNum)+"B";
        return result;
    }
}
