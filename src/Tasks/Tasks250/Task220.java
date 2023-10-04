package Tasks.Tasks250;

class Fruit
    {
        public void showInfo()
            {
                System.out.println("I am a fruit.");
            }
    }

class Apple extends Fruit
    {
        @Override
        public void showInfo()
            {
                super.showInfo();
                System.out.println("I am an apple.");
            }
    }

class Pear extends Fruit
    {
        @Override
        public void showInfo()
            {
                super.showInfo();
                System.out.println("I am a pear.");
            }
    }

public class Task220
    {
        public static void main( String[] args )
            {
                Fruit fruit = new Fruit();
                fruit.showInfo();

                Apple apple = new Apple();
                apple.showInfo();

                Pear pear = new Pear();
                pear.showInfo();
            }

    }
