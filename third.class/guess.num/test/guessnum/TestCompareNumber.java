package guessnum;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestCompareNumber {
    @Test
    public void test0(){
        /*
        当输入1234 1234 应该返回4A0B
         */
        CompareNumber compareNumber = new CompareNumber();
        assertThat(compareNumber.compareNumber("1234","1234"), is("4A0B"));

    }
    @Test
    public void test1(){
        /*
        当输入4321 1234 应该返回0A4B
         */
        CompareNumber compareNumber = new CompareNumber();
        assertThat(compareNumber.compareNumber("4321","1234"), is("0A4B"));

    }
    @Test
    public void test2(){
        /*
        当输入4321 4205 应该返回1A1B
         */
        CompareNumber compareNumber = new CompareNumber();
        assertThat(compareNumber.compareNumber("4321","4205"), is("1A1B"));

    }
}
