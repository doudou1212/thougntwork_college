package guessnum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Guess guess = new Guess();
        System.out.print("Welcome!\n");
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        String input=null;
        String result=null;
        do{
            input = scanner.readLine();
            result = guess.guess(input);
            System.out.println(result);
        }while (result != "Game Over");
        System.out.println("answer is "+guess.getAnwer());
    }
}
