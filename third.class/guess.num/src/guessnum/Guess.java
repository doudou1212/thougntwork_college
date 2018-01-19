package guessnum;

public class Guess {

    private int remainTimes = 6;
    private String anwser="";
    Guess(){
        AnswerGenerator answerGenerator = new AnswerGenerator();
        anwser = answerGenerator.generateNumber();
    }
    static public Boolean isStringContainDuplicateChar(String input){
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
    public String getAnwer(){
        return anwser;
    }
    public String guess(String input){
        String result="";
        if(isStringContainDuplicateChar(input))
            result="Cannot input duplicate numbers!";
        else if(input.matches(".*[a-zA-Z]+.*") || input.length() != 4)
            result="Invalid input string!";
        else{
            CompareNumber compareNumber = new CompareNumber();

            String compareResult = compareNumber.compareNumber(anwser, input);
            Boolean guessRight = (compareResult.equals("4A0B"));
            if(guessRight){
                result = "Congratulations!";
            }
            else{
                remainTimes--;
                if(remainTimes ==0)
                    result = "Game Over";
                else
                    result = compareResult;
            }
        }
        return result;
    }
}
