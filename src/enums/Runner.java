package enums;

import java.time.LocalDate;
import java.time.Month;

public class Runner {


    public static void main(String[] args) {
        // 04-04-1994
        LocalDate data = LocalDate.of(1994, Month.APRIL, 4);
        Game game = new Game();

        for (int i = 0; i < 10; i++) game.flipCoin(CoinFlip.HEADS);

        for (int i = 0; i < 10; i++) System.out.println("Result: " + game.rps(RPS.ROCK));
        for (int i = 0; i < 10; i++) System.out.println("Result: " + game.rps(RPS.PAPER));
        for (int i = 0; i < 10; i++) System.out.println("Result: " + game.rps(RPS.SCISSORS));


    }
}
