package guessnum;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class TestAnswerGenerator {

    @Test
    public void test0(){
        /*
        生成的答案应该是每一位都不重复的
         */
        AnswerGenerator answerGenerator = new AnswerGenerator();
        String result = answerGenerator.generateNumber();
        assertFalse(Guess.isStringContainDuplicateChar(result));
    }

}
