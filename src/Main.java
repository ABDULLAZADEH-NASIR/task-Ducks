public class Main {
    public static void main(String[] args) {


        Duck duck1 = new MallardDuck();
        Duck duck2 = new RubberDuck();
        Duck duck3 = new ReadHeadDuck();
        Duck duck4 = new DecoyDuck();

        duck1.display();
        duck2.display();
        duck3.display();
        duck4.display();

        duck1.swim();
        duck2.swim();
        duck3.swim();


    }

}
