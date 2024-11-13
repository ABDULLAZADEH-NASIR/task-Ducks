public class MallardDuck extends Duck implements Flyable,Quackable{


    @Override
    public void display() {
        System.out.println("Mallard Duck is a type of duck");
    }

    @Override
    public void fly() {
        System.out.println("Mallard Ducks can fly");
    }

    @Override
    public void quack() {
        System.out.println("Mallard Ducks are quack");
    }
}
