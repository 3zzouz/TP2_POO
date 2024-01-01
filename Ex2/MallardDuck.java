package Ex2;

public class MallardDuck extends Duck implements Flyable, Quackable {
    public void display() {
        System.out.println("The MallardDuck is on display");
    }

    public void quack() {
        System.out.println("The MallardDuck is quacking");
    }

    public void fly() {
        System.out.println("The MallardDuck is flying");
    }
}
