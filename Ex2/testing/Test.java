package Ex2.testing;

import Ex2.DecoyDuck;
import Ex2.Duck;
import Ex2.MallardDuck;
import Ex2.RedheadDuck;
import Ex2.RubberDuck;
import Ex2.Flyable;
import Ex2.Quackable;

public class Test {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        ((Flyable) mallardDuck).fly();
        ((Quackable) mallardDuck).quack();

        Duck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        ((Flyable) redheadDuck).fly();
        ((Quackable) redheadDuck).quack();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        ((Quackable) rubberDuck).quack();

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
    }
}
