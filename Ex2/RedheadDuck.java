package Ex2;

public class RedheadDuck extends Duck implements Flyable, Quackable {
    void display() {
        System.out.println("The RedheadDuck is on display");
    }

    public void quack() {
        System.out.println("The RedheadDuck is quacking");
    }

    public void fly() {
        System.out.println("The RedheadDuck is flying");
    }
}
