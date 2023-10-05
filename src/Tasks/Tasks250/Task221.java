package Tasks.Tasks250;

interface Animal {
    void eat();
    void travel();
}

class Elephant implements Animal
    {
        @Override
        public void eat()
            {
                System.out.println("The elephant is eating.");
            }

        @Override
        public void travel()
            {
                System.out.println("The elephant is traveling.");
            }
    }

public class Task221
    {
        public static void main( String[] args )
            {
                Elephant elephant = new Elephant();
                elephant.eat();
                elephant.travel();
            }
    }
