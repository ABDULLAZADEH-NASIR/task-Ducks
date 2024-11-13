public class RubberDuck extends Duck implements Quackable{


    @Override
    public void display() {
        System.out.println("Mallard Duck is a type of duck");
    }

    @Override
    public void quack() {
        System.out.println("Robber Ducks are quack");
    }
}
