package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = String.valueOf(colorSupplier.getRandomColor());
        Ball ball = new Ball(randomColor, randomNumber);
        return ball;
    }
}