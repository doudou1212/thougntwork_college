package guessnum;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;


public class TestGuess {

    @Test
    public void test0(){
        /*
        当输入重复数字的时候应该返回提示 Cannot input duplicate numbers!
         */
        Guess guess = new Guess();
        assertThat(guess.guess("2344"), is("Cannot input duplicate numbers!"));
    }
    @Test
    public void test1(){
        /*
        当有非数字字符的时候 应该返回Invalid input string!
         */
        Guess guess = new Guess();
        assertThat(guess.guess("2a45"), is("Invalid input string!"));
    }
    @Test
    public void test2(){
        /*
        当字符串长度不是四的时候应该返回Invalid input string!
         */
        Guess guess = new Guess();
        assertThat(guess.guess("21456"), is("Invalid input string!"));
    }
    @Test
    public void test3(){
        /*
        当输入次数超过六次则返回Game Over
         */
        Guess guess = new Guess();
        String input = "1234";
        for(int i=0; i < 5;++i)
            guess.guess(input);
        assertThat(guess.guess(input), is("Game Over"));
    }
    @Test
    public void test4(){
        /*
        当猜测对的时候返回Congratulations!;
         */
        Guess guess = new Guess();
        String input = guess.getAnwer();
        assertThat(guess.guess(input), is("Congratulations!"));
    }
}
