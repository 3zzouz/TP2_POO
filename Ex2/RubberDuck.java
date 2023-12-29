package Ex2;

public class RubberDuck extends Duck implements Quackable {
    void display() {
        System.out.println("The RubberDuck is on display");
    }
    public void quack(){
        System.out.println("The RubberDuck is quacking");
    }
}
