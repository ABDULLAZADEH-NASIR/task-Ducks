public class ReadHeadDuck extends  Duck implements Flyable,Quackable{


    @Override
    public void display() {
        System.out.println("Read Head Duck is a type of duck");
    }

    @Override
    public void fly() {
        System.out.println("Read Head Ducks can fly");
    }

    @Override
    public void quack() {
        System.out.println("Read Head Ducks are quack");
    }
}
