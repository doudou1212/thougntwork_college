package guessnum;

import java.util.Arrays;
import java.util.Collections;

public class AnswerGenerator {
    String generateNumber(){
        String result="";
        Integer[] numbers = new Integer[10];
        for(int i=0;i<numbers.length;++i){
            numbers[i]=i;
        }
        Collections.shuffle(Arrays.asList(numbers));
        for(int i=0; i< 4;++i){
            result += String.valueOf(numbers[i]);
        }
        return result;
    }
}
