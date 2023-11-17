package Tasks.Tasks300;

abstract class Animal252{
    private String name;
    abstract public String getName();
}

class Cat extends Animal252
    {
        private String name;

        public Cat( String name )
            {
                this.name = name;
            }

        @Override
        public String getName()
            {
                return "Cat: " + name;
            }
    }

class Dog extends Animal252
    {
        private String name;

        public Dog( String name )
            {
                this.name = name;
            }

        @Override
        public String getName()
            {
                return "Dog: " + name;
            }
    }

public class Task252
    {
        public static void main( String[] args )
            {
                Cat cat = new Cat( "Barsic" );
                System.out.println(cat.getName());

                Dog dog = new Dog( "Bobic" );
                System.out.println(dog.getName());
            }
    }
